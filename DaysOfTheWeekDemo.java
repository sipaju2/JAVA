import java.util.*;

public class DaysOfTheWeekDemo {
    public enum DaysOfTheWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    DaysOfTheWeek days;

    public DaysOfTheWeekDemo(DaysOfTheWeek days) {
        this.days = days;
    }

    public void getDaysOfTheWeek() {
        switch (days) {
        case MONDAY:
            System.out.println("you enter " + days + " which the first day of the week");

            break;
        case TUESDAY:
            System.out.println("you enter " + days + " which the first day of the week");

            break;
        case WEDNESDAY:
            System.out.println("you enter " + days + " which  the first day of the week");

            break;

        case THURSDAY:
            System.out.println("you enter " + days + " which  the first day of the week");

            break;

        case FRIDAY:
            System.out.println("you enter " + days + " which  the first day of the week");

            break;

        case SATURDAY:
            System.out.println("you enter " + days + " which  the first day of the week");

            break;
        case SUNDAY:
            System.out.println("you enter " + days + " which  the first day of the week");

            break;

        default:
            System.out.println("you enter " + days + " which is Not a day of the week");
            break;
        }
    }

    public static void main(String[] args) {

        // Scanner Scan = new Scanner(System.in);
        // System.out.println("Enter a date of a week : ");
        // String days = Scan.nextLine();

        DaysOfTheWeekDemo obj = new DaysOfTheWeekDemo(DaysOfTheWeek.TUESDAY);
        obj.getDaysOfTheWeek();
        DaysOfTheWeekDemo obj1 = new DaysOfTheWeekDemo(DaysOfTheWeek.WEDNESDAY);
        obj1.getDaysOfTheWeek();

    }

}
