import java.util.*;
public class First{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("Quotient:"+(n/i));
        System.out.println("Remainder:"+(n%i));
        }
}