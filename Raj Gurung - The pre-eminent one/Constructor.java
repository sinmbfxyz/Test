class Rectangle {
    //Instance variable
    private int length;
    private int breadth;


    public void Setter(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;

    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.Setter(10, 20);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        int x=r.getLength();
        int y=r.getBreadth();
        System.out.println(x*y);
        
    }
}
