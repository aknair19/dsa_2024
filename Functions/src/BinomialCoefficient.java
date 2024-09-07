import java.util.*;

public class BinomialCoefficient {

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calculateBinomialCoefficient(int n, int r) {

        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binomialCoff = factorial_n / (factorial_r * fact_nmr);
        return binomialCoff;
    }

    public static void main(String[] args) {
        System.out.println(calculateBinomialCoefficient(5, 2));
    }

}

// formula for binomial coefficient is nCr=n!/r!(n-r)!