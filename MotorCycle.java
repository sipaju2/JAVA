public class MotorCycle {
    protected String color;
    protected int speed = 0;
    protected Pilot person;

    // Constructor to initialize Color and speed
    MotorCycle(String color, int speed, Pilot person) {
        this.color = color;
        this.speed = speed;
        this.person = person;
    }

    // Methods
    public void applyBrake(int decrement) {
        this.speed = decrement;
    }

    public void speedUp(int increment) {
        this.speed = increment;
    }

}