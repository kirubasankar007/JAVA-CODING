import java.util.Scanner;
public class Minuteofstudent {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int minute=scr.nextInt();
        int second=minute*60;
        System.out.println("second:"+second);
    }
}
