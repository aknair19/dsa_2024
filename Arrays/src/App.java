import java.util.Arrays;

public class App {

    public static void arrayFC(int num[]) {
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + 1;
        }
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int marks[] = { 1, 2, 3, 4, 5 };
        arrayFC(marks);
    }
}
