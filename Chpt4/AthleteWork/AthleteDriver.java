package AthleteWork;

public class AthleteDriver
{
    public static void main(String[] args) {
        Team soccer = new Team("Soccer", 9);
        Athlete scott = new Athlete("Scott", 16);
        soccer.addAthlete(0, scott);
        Athlete eddie = new Athlete("Eddie", 69);
        soccer.addAthlete(1, eddie);
        Athlete bill = new Athlete("Bill", 17);
        System.out.println(eddie.equals(bill));
        System.out.println(soccer);

    }
}
