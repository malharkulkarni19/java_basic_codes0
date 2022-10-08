public class IfElseStatements {
    public static void main(String[] args){
        int age = 22;

        if(age > 18){
            System.out.println("You are Eligible for Driving,");
        }
        else if(age == 18){
            System.out.println("You are also Eligible Driving");
        }
        else {
            System.out.println("Sorry, You are not Eligible for Driving");
        }
    }
}
