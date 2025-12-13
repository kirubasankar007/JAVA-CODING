import java.util.Scanner;
public class Monthnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4:
                System.out.println("Spring");
                break;
            case 5: case 6: case 7:
                System.out.println("Summer");
                break;
            case 8: case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
