class Rectangle {

    int length;
    int breadth;

}

public class Object1 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;
        System.out.println("Area " + r1.length * r1.breadth);
    }
}