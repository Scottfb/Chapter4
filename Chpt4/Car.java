
public class Car
{
    String color;
    int price;
 
    public Car(int pr, String cl) {
        this.price = pr;
        this.color = cl;
    }
    public String toString() {
       return color; 
    }
    public int getPrice() {
        return price;
    }
}
