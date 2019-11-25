import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class LongString {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        for (int b = strings.size(); b >= 0; b-- ) {
            for (int i = 0; i < strings.size() - 1; i++) {
                if (strings.get(i).length() < strings.get(i + 1).length()) {
                    strings.remove(i);
                } else if (strings.get(i).length() > strings.get(i + 1).length()) {
                    strings.remove(i+1);
                }
            }
        }
        for (int i =0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
