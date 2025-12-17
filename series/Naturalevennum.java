import java.util.Scanner;
public class Naturalevennum 

 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;count<n;i+=2)
        {
            System.out.print(i+" ");
            count++;
        } 
    }
}
