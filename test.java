public class test {
    public static int great;

    public static void main(String[] args) {
        greatestNumber(100, 80, 50);
    }

    public static int greatestNumber(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3)
            great = num1;
        else if (num2 >= num1 && num2 >= num3)
            great = num2;
        else
            great = num3;

        System.out.println("The Higher number out of this three is " + great);

        return great;

    }

}