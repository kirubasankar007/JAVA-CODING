import java.util.Scanner;
public class Atmwithdraw {

 public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  int bal=sc.nextInt();
  int amt=sc.nextInt();
  System.out.println(amt<=bal && amt%100==0?"Success":"Invalid");
 }
}
