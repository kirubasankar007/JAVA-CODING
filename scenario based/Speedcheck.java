import java.util.Scanner;
public class Speedcheck {
    

 public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
  int s=sc.nextInt();
  System.out.println(s>100?"Over Speed":"Within Limit");
 }
}
