import java.util.*;

public class PrimeSum{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int sum=0;
        boolean flag=true;
        for(int i=0;i<size;i++){
            for(int j=2;j<a[i];j++){
                if(a[i]%j==0){
                    flag=false;
                }
            }
            if(flag==true && a[i]!=1){
                sum=sum+a[i];
            }
            flag=true;
        }
        System.out.println(sum);
    }
}
      