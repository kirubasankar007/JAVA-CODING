import java.util.Scanner;
public class Costprice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Selling Price (SP): ");
        double sp = sc.nextDouble();

        System.out.print("Enter Loss Amount: ");
        double loss = sc.nextDouble();

        double cp = sp + loss;   // Formula to calculate Cost Price

        System.out.println("Cost Price (CP) = " + cp);
    }
}
