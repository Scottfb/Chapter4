package AthleteWork;

public class Athlete
{
  private String name;
  private int age;
  
  public Athlete(String nm, int yr) {
      this.name = nm;
      this.age = yr;
    }
  public boolean equals(Athlete other) {
      if(this.name.equals(other.name) && this.age == other.age) {
          return true;
        } else {
            return false;
        }
    }
  public String toString() {
      return name + " who is " + age + " years old";
    }
}
