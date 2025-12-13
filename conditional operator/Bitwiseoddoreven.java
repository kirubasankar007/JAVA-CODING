import java.util.Scanner;

public class Bitwiseoddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }
}
