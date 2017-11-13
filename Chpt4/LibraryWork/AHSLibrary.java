package LibraryWork;

public class AHSLibrary
{
    public static void main(String[] args) {
        //Create a library Object
        Library ahs = new Library(10, "Acalanes");
        Author eddie = new Author("Eddie", 5);
        Book b = new Book(eddie, "Eddie's Life ");
        ahs.addBook(0, b);
        System.out.println(ahs);
    }
}
