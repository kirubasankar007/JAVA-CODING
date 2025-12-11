import java.util.Scanner;
public class  Equal{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        if(a==b)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }

    }
}