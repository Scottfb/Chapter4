package LibraryWork;

public class Author
{
    private String name;
    private int age;
    public Author(String nm, int yr) {
        this.name = nm;
        this.age = yr;
    }
    public String toString() {
        return "The Author's name is: " + this.name + " ,his age is: " + this.age;
    }
}
