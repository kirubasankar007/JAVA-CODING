import java.util.Scanner;

public class Electricitybill {
    
 public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int u = sc.nextInt();
  int bill=0;
  if(u>100) 
    bill+=(Math.min(u,300)-100)*5;
  if(u>300) 
    bill+=(u-300)*10;
  if(u>500) 
    bill+=200;
  System.out.println("Bill = "+bill);
 }
}
