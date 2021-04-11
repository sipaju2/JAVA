public class Books {

    int ID;
    String bookName;
    String author;

    final static int DEFAULT_ID = 1010;

    Books(int ID, String bookName, String author) {
        this.ID = ID;
        this.bookName = bookName;
        this.author = author;
    }

    Books(String bookName, String author) {
        this(DEFAULT_ID, bookName, author);
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Name: " + getBookName() + "\n Author: " + getAuthor() + "\n ID: " + getID() + "\n";
    }
}