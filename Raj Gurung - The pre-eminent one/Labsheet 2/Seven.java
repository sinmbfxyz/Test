import java.util.*;
public class Seven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("1.Sum\n2.Multiplication\n3.Divison\n4.Subractation");
        int c = sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Sum of two number is "+(n+m));
                break;
            case 2:
                System.out.println("Multiplication of two number is "+(n*m));
                break;
            case 3:
                System.out.println("Division of two number is "+(n/m));
                break;
            case 4:
                System.out.println("Subtractation of two number is "+(n-m));
                break;
        }
     }
}


