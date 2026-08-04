public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0, second = 1;

        int next = 0;
        for(int i=1; i<=10; i++) {
            System.out.print(first + ", ");
            next = first + second;

            first = second;
            second = next;
        }
    }
}