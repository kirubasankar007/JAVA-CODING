import java.util.Scanner;
public class Surface {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        int a = sc.nextInt();

        int surfaceArea = 6 * a * a;   // 6a²
        int volume = a * a * a;        // a³
        int perimeter = 12 * a;        // 12a

        System.out.println("Surface Area of Cube = " + surfaceArea);
        System.out.println("Volume of Cube = " + volume);
        System.out.println("Perimeter of Cube = " + perimeter);
    }
}
