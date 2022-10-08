public class CastingNumbers {
    //Casting means change of data-type to another data-type eg:- byte converted to short

    public static void main(String[] args){
        //First Method
        byte byteNumber = 127;
        System.out.println(byteNumber);
        byte newByte = (byte) (byteNumber/2);
        System.out.println(newByte);

        //Another Method
        byte myInt = 9;
        int myByte = myInt;

        System.out.println("The byte value is :" + myInt);
        System.out.println("The int value is :"+ myByte);
    }
}
