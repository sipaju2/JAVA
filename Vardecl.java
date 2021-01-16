public class Vardecl {
    // Static or Class Variable
    public static String me = "First Java Class";
    public static int you = 10;

    // local variable
    public void mylocal() {

        char myChar = 'A';
        System.out.println(myChar);
    }

    public static void main(String args[]) {

        Vardecl obj = new Vardecl();

        // Printing Variable
        System.out.println(me);
        System.out.println(you);
        obj.mylocal();

    }
}