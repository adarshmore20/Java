import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = 0;
        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            sum += digit;
            n /= 10;
        }

        System.out.println("Reverse = " + rev);
        System.out.println("Sum of Digits = " + sum);

        sc.close();
    }
}
