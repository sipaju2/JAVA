import javax.swing.text.View;

public class TestPilot {

    public static void main(String[] args) {

        MotorCycle vehicle = new MotorCycle("red", 5, new Pilot("Steven", 30));
        MountainMotorCycle vehicle1 = new MountainMotorCycle("fuchsia", 55, new Pilot("Patrick", 25), 2, 10);

        System.out.println("The Speed  for vehicle is:" + vehicle.speed);
        System.out.println("The Speed for vehicle  is:" + vehicle.color);
        System.out.println("The Speed for vehicle 1  is:" + vehicle1.color);

        vehicle1.color = "bleu";

        vehicle.applyBrake(0);

        System.out.println("The Speed for vehicle is:" + vehicle.speed);
        System.out.println(vehicle.person.toString());
        System.out.println(vehicle1.person.toString());
        System.out.println("The Speed for vehicle is:" + vehicle1.color);
        System.out.println("The Speed for vehicle 1 is:" + vehicle1.speed);

    }

}