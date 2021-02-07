
public class Average {

    public static void main(String[] args) {

        avgOfThree(4, 5, 4);

    }

    static double avgOfThree(int num1, int num2, int num3) {
        double avg = (num1 + num2 + num3) * 1.0 / 3;
        System.out.printf("The average of this three numbers is %.2f :", avg);
        return avg;
    }

}