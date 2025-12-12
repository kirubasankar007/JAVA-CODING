import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        int notes2000 = amount / 2000;
        amount = amount % 2000;

        int notes500 = amount / 500;
        amount = amount % 500;

        int notes100 = amount / 100;
        amount = amount % 100;  // Remaining amount

        System.out.println("₹2000 notes: " + notes2000);
        System.out.println("₹500 notes: " + notes500);
        System.out.println("₹100 notes: " + notes100);

        if(amount != 0) {
            System.out.println("Remaining amount that cannot be dispensed: ₹" + amount);
        }
    }
}
