import java.util.Scanner;

public class AddGivenContinueNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Numbers you want to add");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int sum = 0;
        do
        {
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }while (n != 0);
        System.out.println ("The sum of digits is : " + sum);
    }
}
