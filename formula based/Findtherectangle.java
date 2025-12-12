import java.util.Scanner;
public class Findtherectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter width: ");
        int w = sc.nextInt();

        int peri = 2 * (l + w);

        System.out.println("Perimeter of Rectangle = " + peri);
    }
}

