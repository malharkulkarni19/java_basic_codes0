import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        //System.out.println("Enter the case");
        //Scanner sc = new Scanner(System.in);
        //int value = sc.nextInt();

        int value = 5;
        switch (value){
            case 1:
                System.out.println("The case 1");
                break;
            case 2:
                System.out.println("The case 2");
                break;
            case 3: case 4: case 5:
                System.out.println("The case 3 or 4 or 5");
                break;
            default:
                System.out.println("Invalid case");
                break;
        }
    }
}
