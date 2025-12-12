import java.util.Scanner;
public class Pricediscount {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int price= src.nextInt();
        int discount= src.nextInt();
        int dis=(price*discount)/100;
        int finalprice=price-dis;
        System.out.println(finalprice);

    }

    
}
