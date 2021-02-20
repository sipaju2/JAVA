public class MountainMotorCycle extends MotorCycle {

    private int seatHeight;
    private int gear;

    MountainMotorCycle(String color, int speed, Pilot person, int seatHeight, int gear) {
        super(color, speed, person);
        this.seatHeight = seatHeight;
        this.gear = gear;
    }

    setHeight(int newValue){
        this.seatHeight=newValue;
    }
}