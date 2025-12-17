import java.util.Scanner;
public class Multiplication {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double mul=1;
        for(int i=1;i<=n;i++)
        {
             mul=mul*i;
            
        }
        System.out.print("mul="+mul);

        
    }
    
}
