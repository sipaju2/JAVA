public class Instructor {

    private String firstName;
    private String lastName;

    public Instructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.virtualMedia = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return " " + getFirstName() + " " + getLastName() +

                ".";
    }

}