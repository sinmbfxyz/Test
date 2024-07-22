import java.util.*;
public class Even{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a= sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<b;i++){
            if(i%2==0){
                if(i%5!=0){
                    System.out.println(i);
                }
            }
        }

    }
}