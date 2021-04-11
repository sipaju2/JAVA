import java.util.ArrayList;

public class Admin {

    protected String userName;
    protected String password;

    ArrayList myLibrarianList = new ArrayList<Librarian>();

    Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void addLibrarian(Librarian newLibrarian) {
        myLibrarianList.add(newLibrarian);
    }

    public ArrayList viewLibrarianList() {
        return myLibrarianList;
    }

    public void viewLibrarian(Librarian librarian) {
        librarian.toString();
    }

    public void deleteLibrarian(Librarian newLibrarian) {
        if (myLibrarianList.contains(newLibrarian)) {
            myLibrarianList.remove(newLibrarian);
        } else {
            System.out.println("Not in the list");
        }
    }

    public String logout() {
        return "You logged out successfully as Admin";
    }

    @Override
    public String toString() {
        return userName + ", " + password;
    }

}
