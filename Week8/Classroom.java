public class Classroom {
    public static void main(String[] args) {

        Instructor teacher1 = new Instructor("Patrick", "Siewe");
        Instructor teacher2 = new Instructor("Innocent", "Djiofack");

        VirtualClass Math = new MathVirtual("Video", teacher1, "Division by 4");
        VirtualClass Philo = new PhiloVirtual("Audio", teacher2, "How to be rich");

        System.out.println(Math.toString());
        System.out.println(Philo.toString());
    }
}