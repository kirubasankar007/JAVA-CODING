import java.util.Scanner;
public class weather {

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
  if(t<15) 
    System.out.println("Cold");
  else if(t<=25) 
    System.out.println("Pleasant");
  else if(t<=35) 
     System.out.println("Hot");
  else
     System.out.println("Heatwave");
 }
}
