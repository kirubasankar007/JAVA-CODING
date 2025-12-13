import java.util.Scanner;
public class firstthreedigit {
    


 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        num = Math.abs(num);          
        int firstDigit = num / 100;  

        if (firstDigit % 2 == 0) {
            System.out.println("First digit is Even");
        } else {
            System.out.println("First digit is Odd");
        }
    }
}
