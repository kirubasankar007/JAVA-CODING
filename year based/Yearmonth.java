import java.util.Scanner;
public class Yearmonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
        } else if (month == 2) {
            if (leap)
                System.out.println("February has 29 days");
            else
                System.out.println("February has 28 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Month has 30 days");
        } else {
            System.out.println("Month has 31 days");
        }
    }
}
