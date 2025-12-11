
import java.util.Scanner;
public class Positiveornegative{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        if(a<0)
        {
            System.out.println("the given number is negative");
        }
        else
        {
            System.out.println("The given number is positive");
        }

    }
}