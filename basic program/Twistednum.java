import java.util.Scanner;
public class Twistednum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(temp!=0)
        {
          int digit=temp%10;
          rev = rev*10+digit;
          temp=temp/10;
        
        }
        System.out.println(rev);

        int c1=0,c2=0;
        for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    c1++;
                }
            }

        for(int i=1;i<=rev;i++)
            {
                if(rev%i==0)
                {
                    c2++;
                }
            }
            if(c1==2&&c2==2)
                {
                    System.out.println("both are prime number");
                }        
            else 
            {
                System.out.println("both are not prime number");
            }
    }
    
}
