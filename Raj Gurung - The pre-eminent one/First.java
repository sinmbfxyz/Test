import java.util.*;
public class First{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer float double and character respectively");
        int n = sc.nextInt();
        float f = sc.nextFloat();
        double d=sc.nextDouble();
        char c = sc.next().charAt(0);
        boolean flag=true;
        System.out.println("integer:"+n);
        System.out.println("float:"+f);
        System.out.println("double:"+d);
        System.out.println("character "+c);
        int a =10,b=20;
        if(a>b){
            flag=true;
        }
        else{
            flag=false;
        }
        if(flag=true){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }
    }

}