import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int pow = 1;

        while (temp > 0) {
            pow = pow * 10;
            temp = temp / 10;
        }

        if (square % pow == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
