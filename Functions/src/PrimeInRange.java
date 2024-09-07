public class PrimeInRange {

    public static boolean checkPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num == 2) {
                return false;
            }
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int end = 20;

        for (int i = 2; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }

    }
}
