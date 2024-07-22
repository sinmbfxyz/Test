import java.util.*;

public class Matadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and colunmns");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the elements of 1st matrix");
        int[][] a = new int[row][col];

        int[][] b = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of array is: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
}