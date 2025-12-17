import java.util.Scanner;
public class Trafficlight {

 public static void main(String[] args){
  String s=new Scanner(System.in).next();
  if(s.equals("Red"))
    System.out.println("Stop");
  else if(s.equals("Yellow")) 
    System.out.println("Ready");
  else if(s.equals("Green")) 
    System.out.println("Go");
 }
}

