import java.util.Scanner;
public class Exceptlastnum{

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int first=a%10;
        int last=a/100;
        int c=first+last;
        System.out.println(c);
        
    }
}