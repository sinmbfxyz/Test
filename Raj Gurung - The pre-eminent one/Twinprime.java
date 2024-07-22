import java.util.*;
public class Twinprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two prime number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == false  || n==1) {
            System.out.println("Wrong input");
        } else {
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == false  || m==1) {
                System.out.println("Wrong input");
            } else {
                int twin = m - n;
                if (twin == 2) {
                    System.out.println("Twin prime");
                } else {
                    System.out.println("Not twin prime");
                }

            }
        }
    }

}