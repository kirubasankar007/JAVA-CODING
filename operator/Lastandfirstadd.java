import java.util.Scanner;
public class Lastandfirstadd {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int last=a%10;
        int first=a/100;
        int add=first+last;
        System.out.println(add);
    }
}
