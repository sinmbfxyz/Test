import java.util.*;
public class Second {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int n = sc.nextInt();
        int x = n;
        //Separate digit
        int i = 1000;
        int sum=0;
        do{
    
            int a = n/i;
            System.out.println(a);
            sum=sum+a;
            n = n%i;
            i=i/10;

        }while(n>0);
System.out.println(sum);
int rev=0;
int rem=0;
int square=0;
do{
    rem = x%10;
    rev = rev*10+rem;
    square = square+rem*rem;
    x = x/10;
}while(x>0);
System.out.println(rev);
System.out.println(square);
}

}

