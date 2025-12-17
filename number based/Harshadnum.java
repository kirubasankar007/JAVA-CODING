import java.util.Scanner;
public class Harshadnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while (temp!=0) {
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;  
        }
        if(n%sum==0)
        {
            System.out.println("harshad number");
        }
        else 
        {

            System.out.println("not harshd number");
        }

    }
    
}
