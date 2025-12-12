import java.util.Scanner;
public class Rectangle {

     public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int length=src.nextInt();
        int breath=src.nextInt();
        int rectangle=length*breath;
        System.out.println("areaofrectangle:"+rectangle);
     }
}