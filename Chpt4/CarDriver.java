
public class CarDriver
{
    public static void main() {
        Car toyota = new Car(50000, "Red");
        
        System.out.println("The color is: " + toyota.toString());
        System.out.println("The price is: " + toyota.getPrice());
    }
}
