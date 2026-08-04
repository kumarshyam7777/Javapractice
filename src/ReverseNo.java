import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:--- ");
        int num = input.nextInt();
        input.close();
        int reverse = 0;
        while (num != 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse Number is:-- " +reverse);

    }
}
