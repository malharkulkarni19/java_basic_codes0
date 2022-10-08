public class Method1InJava {
    public static void main(String[] args){
        myMethod();                        //This is method name usedin below statement.
        System.out.println("Again, we try to run the same method");
        myMethod();
    }
    public static void myMethod(){        //This is method we want to run.
        String name = "Malhar";
        int age = 22;
        double height = 6.3;
        System.out.println("My Name is :" + name);
        System.out.println("My age is :" + age);
        System.out.println("My height is :" + height);
    }
}
