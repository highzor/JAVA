public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        System.out.println(Arrays.toString(array));
        int max = array.length-1;
        int min = 0;
        int key = 13;
        binarySearch(key, array, max, min);
    }
    public static void binarySearch(int key, int[] array, int max, int min) {
        if (array[max] < array[min]) return;
        int midPoint = findMidPoint(max, min);
        if (array[midPoint] < key) binarySearch(key, array, max, midPoint+1);
        else if (array[midPoint] > key) binarySearch(key, array, midPoint-1, min);
        else System.out.println(midPoint);
    }
    public static int findMidPoint(int max, int min) {
        return (max+min)/2;
    }
}
