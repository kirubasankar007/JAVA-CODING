import java.util.Scanner;
public interface Threedigit {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        String sum=(a>=100&&a<=999 || a<=-999&&a>=-100)?"threedigit":"not three digit";
        System.out.println(sum);
    }
}
