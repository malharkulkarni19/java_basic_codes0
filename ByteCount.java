public class ByteCount {
    public static void main(String[] args){
        byte a1 = Byte.MAX_VALUE;
        byte a2 = Byte.MIN_VALUE;
        System.out.println(a1);
        System.out.println(a2);

        byte a3 = Byte.MAX_VALUE;
        int a4 = a3 + 363636363;
        System.out.println("The adiition of max byte value and 1 is : " + a4);
    }
}
