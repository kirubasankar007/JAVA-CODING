import java.util.Scanner;
public class Perimeterofsquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        int peri = 4 * side;

        System.out.println("Perimeter of Square = " + peri);
    }
}
