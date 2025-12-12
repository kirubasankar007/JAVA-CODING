import java.util.Scanner;
public class Bytestobit {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bytes: ");
        int bytes = sc.nextInt();

        int bits = bytes * 8;

        System.out.println("Bits = " + bits);
    }
}
