import java.util.*;

class Vehicle {
    private String brand;
    private String name;
    private int tax;

    public void Set(String brand, String name, int tax) {
        this.brand = brand;
        this.name = name;
        this.tax = tax;
    }

    public String getbrand() {
        return this.brand;
    }

    public String getname() {
        return this.name;
    }

    public int getTax() {
        return this.tax;
    }
}

public class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        System.out.println("Enter the name brand and tax of the first car");
        String name = sc.nextLine();
        String brand = sc.nextLine();
        int tax = sc.nextInt();
        System.out.println("Enter the name brand and tax of the second car");
        String name1 = sc.nextLine();
        String brand1 = sc.nextLine();
        int tax1 = sc.nextInt();
        v1.Set(brand, name, tax);
        v2.Set(brand1, name1, tax1);
        if (tax > tax1) {
            System.out.println(v1.getbrand() + "\n" + v1.getname() + "\n" + v1.getTax());
        } else {
            System.out.println(v2.getbrand() + "\n" + v2.getname() + "\n" + v2.getTax());
        }

    }
}