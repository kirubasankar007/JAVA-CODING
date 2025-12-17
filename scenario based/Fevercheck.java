import java.util.Scanner;

public class Fevercheck {
    
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
  double t=sc.nextDouble();
  System.out.println(t>100?"Fever":"Normal");
 }
}
