import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]) {
        float pie = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius = sc.nextFloat();
        float area = pie * radius * radius;
        System.out.println("Area of the circle is" + area);
    }

}
