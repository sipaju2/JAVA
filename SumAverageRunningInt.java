
public class SumAverageRunningInt {

    public static int i;
    public static int sum = 0;

    public static void main(String[] args) {

        /// Sum of 1, 2, 3, ..., to 100.
        for (i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(" The total of numbers from 1 to 100 is: " + sum);

    }

}