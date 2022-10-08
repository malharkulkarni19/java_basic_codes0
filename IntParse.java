public class IntParse {
    public static void main(String[] args) {
        String myString = "2500";
        System.out.println("String is : " + myString);

        int myInt = Integer.parseInt(myString);
        System.out.println("Old Integer Value is :" + myInt);
        myInt = myInt + 35;
        System.out.println("New Integer value is : " + myInt);
    }
}
