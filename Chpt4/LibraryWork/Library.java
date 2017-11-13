package LibraryWork;

public class Library
{
    private String name;
    private Book[] books;
    
    public Library(int size, String nm) {
        this.name = nm;
        this.books = new Book[size];
    }
    public String toString() {
      String output = "The library " + name + " has the following: \n" ;
      for(Book b : books) {
          output += b + "\n";
        }
      return output;
    }
    public void addBook(int location, Book b) {
        books[location] = b;
    }
}
