
package PracticeQuestions;

import java.util.*;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= input; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else if (i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("Oddsum is " + oddSum);
        System.out.println("Evensum is " + evenSum);

    }
}

/**
 * create a loop and find out check if the remainder is 1 then it is odd and add
 * it to odd sum
 * if the remainder is 0 then add the number to even sum
 * 
 */