import java.util.Scanner;
public class PerimeterofTriangle {

         public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter side A: ");
            int a = sc.nextInt();
    
            System.out.print("Enter side B: ");
            int b = sc.nextInt();
    
            System.out.print("Enter side C: ");
            int c = sc.nextInt();
    
            int peri = a + b + c;
    
            System.out.println("Perimeter of Triangle = " + peri);
        }
}
    