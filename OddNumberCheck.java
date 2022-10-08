public class OddNumberCheck {
    public static void main(String[] args) {
        boolean a = check(6);
        System.out.println(a);
    }
    public static boolean check(int a){
        if((a % 2) == 0){
             return true;
        }
        else {
            return false;
        }
    }
}
