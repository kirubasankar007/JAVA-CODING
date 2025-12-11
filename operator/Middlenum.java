import java.util.Scanner;
public class Middlenum{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int middle=(a/10)%10;
        System.out.println(middle);
        
    }
}