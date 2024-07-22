import java.util.*;
class Product{
    private String name;
    private int price;
    private int quantity;
    private int total;

    // Parameterized Constructor
    public void product(String name, int price, int quantity,int total) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total=total;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;

    }
    public int getQUANTITY(){
        return this.quantity;
    }
public int getTotal(){
    return this.total;
}
}

public class ProductDemo{
    public static void main(String[] args) {
        Product p1= new Product();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the product,price and quantity");
        String name = sc.next();
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        int total=price*quantity;
        p1.product(name,price,quantity,total);
        System.out.println("Name of the product is "+p1.getName());
        System.out.println("Price of the product is "+p1.getPrice());
        System.out.println("Quantity of the product is "+p1.getQUANTITY());
        System.out.println("Total of the product is "+p1.getTotal());
        }
    }