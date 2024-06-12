public class Giraffe extends AnimalBase {
    public Giraffe(String name) {
        super(name);
    }
    public void eat() {
        System.out.println(getName() + " je liście.");
    }
    public String getType() {
        return "Żyrafa";
    }
}