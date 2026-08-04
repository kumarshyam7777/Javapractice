package arrayproblems;

public class ArraySum {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40};
        int[] y = {67, 97, 62};
        int sum = 0;

        for (int k : x) {
            sum += k;
        }

        System.out.println("sum of first array is that is x:-" + sum);
        for (int i : y) {
            sum += i;
        }
        System.out.println("The sum is :- " + sum);
    }
}
