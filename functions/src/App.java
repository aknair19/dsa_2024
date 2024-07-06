public class App {

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static int addSum(int num1, int num2) {
        return num1 + num2;

    }

    public static void main(String[] args) throws Exception {
        printHello();
        int res = addSum(11, 111);
        System.out.println(res);
    }
}
