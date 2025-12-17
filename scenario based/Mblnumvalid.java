import java.util.Scanner;
public class Mblnumvalid {
    
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String m=sc.next();
  System.out.println(m.length()>=10?"Valid Number":"Invalid Number");
 }
}
