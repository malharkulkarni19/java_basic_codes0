public class DataTypeChallenge {
    public static void main(String[] args){
        int num1 = 10;
        byte num2 = 15;
        short num3 = 20;

        long num4 = 1000 * (num1 + num2 + num3);
        System.out.println("The Addition of int and byte and short is: " + num4);
    }
}
