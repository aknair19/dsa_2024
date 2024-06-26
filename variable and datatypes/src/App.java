import java.util.*;

public class App {
    // public static void main(String[] args) throws Exception {
    // Scanner sc = new Scanner(System.in);
    // int range = sc.nextInt();
    // int start = 1;
    // while (start <= range) {
    // System.out.print(start + " ");

    // start++;
    // }
    // }

    public static void main(String[] args) {
        // print sum of N natural numbers
        // eg input is 5 then answer will be 1+2+3+4+5=15
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= input) {
            sum += start;
            start++;
        }
        System.out.println(sum);
    }
}

/**
 * 5
 * 5
 * 
 * Java
 * 
 * 
 * 
 * 
 */