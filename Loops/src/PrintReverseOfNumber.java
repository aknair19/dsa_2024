public class PrintReverseOfNumber {
    public static void main(String[] args) {
        // 1099 => 9901
        // if we want last digit of any number then divide it by 10 and get the
        // remainder => 11%2
        int number = 1699;
        int res = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;

        }

    }
}
