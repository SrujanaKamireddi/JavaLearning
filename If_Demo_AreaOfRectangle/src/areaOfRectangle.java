import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle : ");
        float length = Scan.nextFloat();
        System.out.println("Enter breadth of a rectangle : ");
        float breadth = Scan.nextFloat();

        float area = length *  breadth;
        System.out.println("Area of the given rectangle : " + area);
    }
}
