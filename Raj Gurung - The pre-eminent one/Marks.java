import java.util.*;
public class Marks {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the marks of 5");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    int sum=a+b+c+d+e;
    System.out.println(sum);
    double per=sum*100/500;
    System.err.println();
    if(per>=80&& per<=100){
        System.out.println("Distinction");

    }
    else if(per>=60){
        System.out.println("First Division");

    }
    else if(per>=40){
        System.out.println("Second Divison");

    }
    else{
        System.out.println("Fail");
    }
}
}