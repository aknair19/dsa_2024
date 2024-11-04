public class BinarySearch {

    public static int findKey(int list[], int key) {
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list[mid] == key) {
                return mid;
            }
            if (list[mid] > key) {// right side
                end = mid - 1;
            } else {// left side
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 99;
        System.out.println(key + " is at index " + findKey(numbers, key));
    }
}
