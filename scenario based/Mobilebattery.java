import java.util.Scanner;

public class Mobilebattery {
    

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  int b=sc.nextInt();
  if(b<20) 
    System.out.println("Low Battery");
  else if(b<=50) 
    System.out.println("50% Consumed");
  else
     System.out.println("Battery Full");
 }
}
