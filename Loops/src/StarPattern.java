public class StarPattern {
    public static void main(String[] args) {
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // }

        // inverted star

        int n = 5;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

/**
 * we have to print the star in the below given format
 * *
 * **
 * ***
 * ****
 * *****
 * inorder to print the star in the given format
 * we first need to think the logic
 * so the outerloop should run in the given question lets say 4 number of times
 * and the inner loop should run i number of times
 * 
 */