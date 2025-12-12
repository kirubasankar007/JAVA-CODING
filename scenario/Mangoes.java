import java.util.Scanner;
public class Mangoes {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of 1 mango: ");
        double price = sc.nextDouble();

        System.out.print("Enter total mangoes purchased: ");
        int purchased = sc.nextInt();
        int free = purchased / 3; 
        int totalMangoes = purchased + free;

        double amount = purchased * price; 

        System.out.println("Total mangoes received: " + totalMangoes);
        System.out.println("Amount to pay: $" + amount);
    }
}
