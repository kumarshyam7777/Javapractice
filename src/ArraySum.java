public class ArraySum {
    public static void main(String[] args) {
        int[] x = {10,20,30,40};
        int [] y = {67,97,62};
        int sum = 0;
        for (int j : x) {
            for (int i : y) {
                sum += i;
            }
            sum += j;

        }
        System.out.println("The sum is:  " + sum);
    }
}
