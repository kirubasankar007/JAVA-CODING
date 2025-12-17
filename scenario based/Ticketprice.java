import java.util.Scanner;
public class Ticketprice {
    
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  if(a<12) 
    System.out.println("Child");
  else if(a<60) 
    System.out.println("Adult");
  else 
    System.out.println("Senior");
 }
}
