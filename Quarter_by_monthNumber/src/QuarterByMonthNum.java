import java.util.Scanner;

public class QuarterByMonthNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month num to know quarter");
        int monthNum = scanner.nextInt();
        String month = null;

        switch (monthNum){
            case 1:
            case 2:
            case 3:
            case 4:
                month = "Quarter -1";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                month = "Quarter -2";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                month = "Quarter -3";
                break;
            default:
                month = "Unknown";
                break;
        }
        System.out.println(month);
    }
}
