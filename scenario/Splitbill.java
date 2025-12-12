import java.util.Scanner;
public class Splitbill {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int bill= src.nextInt();
        int friends= src.nextInt();
        int eachamount=bill/friends;
        System.out.println(eachamount);

    }

    
}
