import java.util.Scanner;
public class Automorphicnum {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;

        int temp = num;
        int power = 1;

        // Find 10^digits
        while (temp > 0) {
            power = power * 10;
            temp = temp / 10;
        }

        if (square % power == num) {
            System.out.println(square+ " Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
