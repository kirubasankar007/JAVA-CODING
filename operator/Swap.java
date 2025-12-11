import java.util.Scanner;
public class Swap{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}