import java.util.Scanner;
class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount;

        if (bill >= 5000) 
            discount = bill * 0.20;
        else if (bill >= 2000) 
            discount = bill * 0.10;
        else 
            discount = bill * 0.05;

        System.out.println("Final Amount = " + (bill - discount));
    }
}
