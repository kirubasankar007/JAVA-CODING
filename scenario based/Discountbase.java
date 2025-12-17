import java.util.Scanner;
public class Discountbase{

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  if(a>5000) 
    System.out.println("20%");
  else if(a>2000) 
    System.out.println("10%");
  else 
    System.out.println("5%");
 }
}

