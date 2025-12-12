import java.util.Scanner;
public class Sellingprice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price (CP): ");
        double cp = sc.nextDouble();

        System.out.print("Enter Profit: ");
        double profit = sc.nextDouble();

        double sp = cp + profit;

        System.out.println("Selling Price = " + sp);
    }
}
