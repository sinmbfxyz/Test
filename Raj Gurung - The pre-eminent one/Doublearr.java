import java.util.*;

public class Doublearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered array is: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
    }
}