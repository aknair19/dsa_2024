package PracticeQuestions;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // Brute force approach
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // if (number == 2) {
        // System.out.println("You have entered a prime number");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i < number - 1; i++) {
        // if (number % i == 0) {
        // isPrime = false;
        // }
        // }
        // if (isPrime == true) {
        // System.out.println("number is prime");
        // } else {
        // System.out.println("number is not prime");
        // }
        // }

        // }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("You have entered a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }

    }
}
