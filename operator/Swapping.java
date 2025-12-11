import java.util.Scanner;
public class Swapping{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}