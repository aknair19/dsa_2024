public class LinearSearch {
    public static int search(int array[], int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 6, 7, 9 };
        int search = 10;
        int result = search(array, search);

        if (result == -1) {
            System.out.println("Number not found in the given series");
        } else {

            System.out.println("The number searched is at " + result + " place");
        }

    }

}
