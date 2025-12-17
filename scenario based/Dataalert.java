import java.util.Scanner;
public class Dataalert {
    

 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
  int d=sc.nextInt();
  if(d<30) 
    System.out.println("Low Data");
  else if(d<=100) 
    System.out.println("Half Consumed");
  else 
    System.out.println("Data Over");
 }
}
