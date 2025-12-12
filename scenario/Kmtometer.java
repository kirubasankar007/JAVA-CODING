import java.util.Scanner;
public class Kmtometer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();

        double meter = km * 1000;

        System.out.println("Distance in meters = " + meter);
    }
}
