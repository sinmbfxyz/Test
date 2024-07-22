class Rectangles {
    private int length;
    private int breadth;

    public Rectangles(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void comparerect(Rectangles r) {
        if (this.length == r.length && this.breadth == r.breadth) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

    }
}

public class Parameter {
    public static void main(String[] args) {
        Rectangles r1 = new Rectangles(10, 20);
        Rectangles r2 = new Rectangles(10, 20);
        r1.comparerect(r2);
    }
}
