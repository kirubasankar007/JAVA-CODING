import java.util.Scanner;
public class Differenceoddoreven {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diff=a-b;
       String c=(diff%2==0)? "even": "odd";
        System.out.println(c);
    }
}