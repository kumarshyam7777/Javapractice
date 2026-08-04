
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the value of x:-");
            int x= s.nextInt();
            fact(x);
        }
    }
    public static void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }

        System.out.print(fact);
    }
}

