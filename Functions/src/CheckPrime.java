public class CheckPrime {

    public static boolean checkPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        // prime numbers are those numbers which are multiple of 1 and its own
        System.out.println(checkPrime(3));
    }
}
