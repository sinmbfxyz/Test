import java.util.*;
public class Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        int i = 0;
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}