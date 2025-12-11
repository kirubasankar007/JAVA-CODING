
import java.util.Scanner;
public class Passorfail{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        if(a>=45)
        {
            System.out.println("you were pass");
        }
        else
        {
            System.out.println("you were fail");
        }

    }
}