public class PrintDayInWord {
    // private static String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday",
    // "Thursday", "Friday", "Sartuday" };

    public static void main(String[] args) {
        // Using for Loop
        /*
         * for (int i = 0; i < days.length; i++) { System.out.println(days[i]); }
         * 
         * }
         */

        // Using switch Statement
        dayNumber(4);
    }

    // Using Switch Statement
    public static void dayNumber(int i) {
        switch (i) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong Number");
        }

    }
}
