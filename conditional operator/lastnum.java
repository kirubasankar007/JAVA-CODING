import java.util.Scanner;
public class lastnum {
    public static void main(String[] args) {
        Scanner sc = new 
        Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        if(b%3==0)
            {
                System.out.println("last digit divide in 3");
            }
            else
                {
                    System.out.println("last digit  not divide in 3");
                }
    }
}