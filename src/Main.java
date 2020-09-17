import animal.Animal;
import animal.Chiken;
import animal.Edible;
import animal.Tiger;
import fruit.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();
        for (Animal anm : animals) {
            System.out.println(anm.makeSound());
            if (anm instanceof Chiken) {
                Edible edible = (Chiken) anm;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
