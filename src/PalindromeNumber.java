import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (reverse == number) {
            System.out.println(number + " is a palindrome number.");
        } else  {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
