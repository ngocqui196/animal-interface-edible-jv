package animal;

public class Chiken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chiken: cluck!-cluck!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
