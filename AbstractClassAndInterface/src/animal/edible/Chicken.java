package animal.edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "O o oooooo";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
