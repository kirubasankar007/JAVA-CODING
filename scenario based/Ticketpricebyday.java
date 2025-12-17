import java.util.Scanner;
public class Ticketpricebyday {
    

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  String d=sc.next();
  System.out.println(d.equals("Sunday")||d.equals("Saturday")?"Weekend":"Weekday");
 }
}
