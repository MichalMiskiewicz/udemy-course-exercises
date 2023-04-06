package pl.mmiskiewicz;

public class Main {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("Tiger1", 5));
        zoo.addAnimal(new Tiger("Tiger2", 3));
        zoo.addAnimal(new Lion("Lion1", 3));
        zoo.addAnimal(new Lion("Lion2", 8));
        zoo.printAllAnimals();
    }
}