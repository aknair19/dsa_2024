public class Factorial {

    public static int calculateFactorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int res = calculateFactorial(30);
        System.out.println(res);
    }
}
