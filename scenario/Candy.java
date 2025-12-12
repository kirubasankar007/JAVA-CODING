public class Candy {
    

import java.util.Scanner;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int students = sc.nextInt();
        int eachGets = candies / students;   // candies per student
        int remaining = candies % students;  // leftover candies

        System.out.println("Each student gets: " + eachGets);
        System.out.println("Candies remaining: " + remaining);
    }
}
