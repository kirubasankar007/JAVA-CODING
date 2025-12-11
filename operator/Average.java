import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg);
    }
}