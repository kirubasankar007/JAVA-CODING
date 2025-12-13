import java.util.Scanner;
public class Threegreater {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
    if(a>b && a>c)
    {
        System.out.println(a+"a is greater ");
    }
    else if(b>a && b>c)
        {
            System.out.println(b+"b is greater ");
        }
    else{
        System.out.println(c+"c is greater");
    }       

    }
}
