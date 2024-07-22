import java.util.*;

public class Prime {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean isPrime = true;
            if (i == 57) {
                break;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}