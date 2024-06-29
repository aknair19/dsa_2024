import java.util.Scanner;

public class PrintNumberUntilMultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        while (true) {
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println("Entered number is " + num + " which is not a multiple");
        }
        System.out.println("Entered number is multiple of 10");
    }

}

/*
 * Statement is print the input on the go until you receive a number which is
 * multiple of 10
 */