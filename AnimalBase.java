public abstract class AnimalBase implements Animal {
    private String name;
    public AnimalBase(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void sleep() {
        System.out.println(name + " śpi.");
    }
}