import java.util.Scanner;
class Armstrong
 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int temp = num;
        int sum = 0;
        int digits=0;
        while(temp!=0)
        {
            digits++;
            temp=temp/10;
        }
        temp=num;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (int)Math.pow(rem, digits);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(sum+" Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
