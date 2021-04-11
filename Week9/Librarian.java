import java.util.ArrayList;

public class Librarian extends Admin {

    // String userName;
    // String password;
    ArrayList myBookList = new ArrayList<Books>();
    ArrayList issuedBookList = new ArrayList<Books>();

    Librarian(String userName, String password) {
        super(userName, password);
    }

    public void addBook(Books myBook) {
        myBookList.add(myBook);
    }

    public ArrayList viewBookList() {
        return myBookList;
    }

    public void issueBook(Books myBook) {
        if (myBookList.contains(myBook)) {
            myBookList.remove(myBook);
            issuedBookList.add(myBook);
        } else {
            System.out.println("Not in the list");
        }
    }

    public ArrayList ViewIssueBooks() {
        return issuedBookList;
    }

    public void returnBook(Books myBooks) {
        if (issuedBookList.contains(myBooks)) {
            issuedBookList.remove(myBooks);
            myBookList.add(myBooks);
        } else {
            System.out.println("The Book doesn't belong to this library or wasn't properly issued ");
        }
    }

    @Override
    public String logout() {
        return "You logged out successfully as librarian";
    }

    @Override
    public String toString() {
        return "Librarian: " + super.toString() + "\n";
    }

}
