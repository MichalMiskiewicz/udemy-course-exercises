package pl.mmiskiewicz;

import java.util.ArrayList;

public class Zoo<T extends Animal> {

    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void printAllAnimals(){
        animals.forEach(System.out::println);
    }
}
