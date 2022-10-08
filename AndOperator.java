public class AndOperator {
    public static void main(String[] args){
        int a = 12;
        int b = 16;
        if(a == 12 && b == 16){
            //&& is used fot AND Operator
            System.out.println("This is fine");
        }
        //It only gives answer when both conditions are true
        if((a != 15) && (b!= 36)){
            System.out.println("This is also fine");
        }
        if((a >= 10) && (b <= 17)){
            System.out.println("Ok, Fine");
        }
    }
}
