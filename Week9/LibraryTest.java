public class LibraryTest {

    public static void main(String[] args) {
        Books book1 = new Books(123, "A Book", "A. Author");
        Books book2 = new Books("Another Book", "B. Arthur");
        Books book3 = new Books("Adventures of Coding", "J. Masters");

        Admin bossman = new Admin("Admin", "PS123");
        Librarian Patrick = new Librarian("PSiewe", "865875");
        Librarian Leonel = new Librarian("userName", "igidisd70");
        Patrick.addBook(book1);
        Patrick.addBook(book2);
        Leonel.addBook(book3);
        bossman.addLibrarian(Patrick);
        bossman.addLibrarian(Leonel);

        System.out.println(Patrick.viewBookList() + "\n " + Leonel.viewBookList());
        System.out.println(bossman.viewLibrarianList());
    }
}