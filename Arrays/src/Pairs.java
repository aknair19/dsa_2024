public class Pairs {

    public static void printPair(int list[]) {
        int tp = 0;

        for (int i = 0; i < list.length; i++) {
            int curr = list[i];

            for (int j = i + 1; j < list.length; j++) {
                System.out.print("( " + curr + ", " + list[j] + ")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("total pairs are " + tp);
    }

    public static void main(String[] args) {
        int Numbers[] = { 2, 4, 6, 8, 10, 12 };
        printPair(Numbers);
    }
}

/*
 * In this module we need create pairs based on the array given
 * Pairs means all the elements in an array should have an array with all the
 * elements
 * so for this we need to have two loops to implement
 * outer loop will run till array length
 * inner loop will be initialized with outer loop initialization +1
 * and inner loop also run till array's length
 * total pairs is n(n-1)/2
 * or sum of (n-1) numbers
 */