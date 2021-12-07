import java.util.Scanner;

public class If_Demo {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is odd or even: ");
        int number = Scan.nextInt();
        while (number!=0){
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.println("Enter 0 to quit");
            System.out.println("Enter a number to check whether it is odd or even: ");
            number =Scan.nextInt();
        }

    }
}
