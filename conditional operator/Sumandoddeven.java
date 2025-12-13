import java.util.Scanner;
public class Sumandoddeven {
    2
    3
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        if (sum % 2 == 0) {
            System.out.println("Sum is Even");
        } else {
            System.out.println("Sum is Odd");
        }
    }
}
