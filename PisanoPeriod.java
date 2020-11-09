import java.util.ArrayList;
import java.util.Scanner;

public class Pisano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> period = new ArrayList<>();
        long n = scanner.nextLong();
        int m = scanner.nextInt();
        if (n < 1 || n > 1000000000000000000L) return;
        if (m < 2 || m > 100000) return;
        int[] fib = new int[2];
        if (n == 1) {
            System.out.println(n);
            return;
        }
        long a = 0;
        fib[0] = 0;
        fib[1] = 1;
        period.add(fib[0]);
        while (a < n+1) {
            int res = fib[1];
            fib[1] = (res+fib[0])%m;
            fib[0] = res;
            if (fib[0] == 0 && fib[1] == 1) {
                break;
            } else {
                period.add(fib[0]);
                a++;
            }
        }
        System.out.println(period.get((int)(n%(period.size()))));
    }
}
