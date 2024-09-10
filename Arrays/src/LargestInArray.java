public class LargestInArray {

    public static int getLargestInArray(int list[]) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > result) {
                result = list[i];
            }
        }
        return result;
    }

    public static int getSmallestInArray(int list[]) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < result) {
                result = list[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int list[] = { 2, 2, 4, 6, 7, 1, 4, 5, 6 };
        System.out.println("Max value is " + getLargestInArray(list));
        System.out.println("Min value is " + getSmallestInArray(list));

    }
}
