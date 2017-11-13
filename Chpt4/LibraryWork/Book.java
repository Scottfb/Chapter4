package LibraryWork;

public class Book
{
    private Author author;
    private String title;
    
    public Book(Author aut, String tit) {
        this.author = aut;
        this.title = tit;
    }
    public String toString() {
        return "The title is: " + this.title + author;
    }
}
