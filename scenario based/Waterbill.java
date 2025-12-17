import java.util.Scanner;
public class Waterbill {
    

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  int l=sc.nextInt();
  int bill=0;
  if(l>1000) 
    bill+=Math.min(l-1000,2000)/1000*5;
  if(l>3000) 
    bill+=(l-3000)/1000*10;
  System.out.println("Bill = "+bill);
 }
}

