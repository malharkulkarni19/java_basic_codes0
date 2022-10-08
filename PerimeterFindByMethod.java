public class PerimeterFindByMethod {
    public static void main(String[] args){
        perimeterOfRectangle(10, 20);
    }
    public static void perimeterOfRectangle(int length, int breadth){
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of Rectangle is : " + perimeter);
    }
}
