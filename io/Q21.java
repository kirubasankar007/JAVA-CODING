import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Door No and Street: ");
        String line1 = sc.nextLine();
        System.out.print("Enter City: ");
        String line2 = sc.nextLine();
        System.out.print("Enter State: ");
        String line3 = sc.nextLine();
        System.out.print("Enter Country: ");
        String line4 = sc.nextLine();
        System.out.println(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4);
    }
}
