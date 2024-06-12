import java.util.ArrayList;
import java.util.List;
public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Elephant());
        animals.add(new Tiger("Tygrys Tobiasz"));
        animals.add(new Giraffe("Żyrafa Żaneta"));

        for (Animal animal : animals) {
            System.out.println("Zwierzę: " + animal.getType());
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}