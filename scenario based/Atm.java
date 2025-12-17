import java.util.Scanner;

public class Atm {
    
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    int pin=sc.nextInt();
  System.out.println(pin==1234?"PIN Correct":"Invalid PIN");
 }
}
