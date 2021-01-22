public class showCase {
    public static int num1 = 30;
    public static int num2 = 20;
    public static int num3 = 0;
    public static boolean a1 = true;
    public static boolean b1 = false;

    public static void main(String[] args) {

        // Arithmetic
        num3 = num1 + num2;
        System.out.println("the value of addition of num1 and num2 is: " + num3);

        // Assignment
        num1 += num2;
        System.out.println("the value of addition of num1 and num2 is: " + num1);

        // Auto-Increment
        num3 = ++num1;
        System.out.println("the increment of num1 is: " + num3);

        // logical
        if (a1 && b1) {
            System.out.println(" the condition is true");
        } else {
            System.out.println(" the condition is false");
        }

        // comparison
        if (num1 > num2) {
            System.out.println(" num1 is higher than num2");
        } else {
            System.out.println(" num1 is lower than num2");
        }

        // Bitwise operators
        num3 = num1 ^ num2;
        System.out.println("the value of num1 ^ num2 is: " + num3);
        // Ternary
        num3 = (num1 > num2) ? 500 : 100;
        System.out.println("the value of num3 " + num3);
    }
}