import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a integer");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
