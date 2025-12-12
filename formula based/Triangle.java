import java.util.Scanner;
public class Triangle {

     public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int base=src.nextInt();
        int height=src.nextInt();
        int triangle=(base*height)/2;
        System.out.println("areaoftriangle:"+triangle);
     }
}