public class TableOf9ByWhileLoop {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        int table;

        while(b <= 10){
            table = a * b;
            System.out.println(a + " * " + b + " = " + table);
            b++;
        }
    }
}
