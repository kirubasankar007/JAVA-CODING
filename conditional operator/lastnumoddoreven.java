import java.util.Scanner;
public class lastnumoddoreven {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
    
            int lastDigit = num % 10; 
            if (lastDigit % 2 == 0) {
                System.out.println("Last digit is Even");
            }
             else
             {
                System.out.println("Last digit is Odd");
            }
        }
    }
    