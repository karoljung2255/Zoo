public class Tiger extends AnimalBase {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " je mięso.");
    }
    @Override
    public String getType() {
        return "Tygrys";
    }
}