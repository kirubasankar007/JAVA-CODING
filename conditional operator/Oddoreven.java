
import java.util.Scanner;
public class Oddoreven {
    


    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);
        int a=sc.nextInt();
       String c=(a%2==0)? "even": "odd";
        System.out.println(c);
    }
}