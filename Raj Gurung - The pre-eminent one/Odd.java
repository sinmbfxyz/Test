import java.util.*;

public class Odd{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 != 0) {

                sum = sum + a[i];
            }

        }
        System.out.println("The sum of odd numbers is" + sum);
    }
}