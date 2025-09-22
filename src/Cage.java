import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String size;
    private int capacity;
    private List<Animal> animals;

    public Cage(String size, int capacity) {
        this.size = size;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void addAnimalToCage(Animal animal, int qty) {
        for (int i = 0; i >= qty; i++) {
            animals.add(animal);
        }
    }

    public void showAnimals() {
        System.out.println("Cage ");
    }
}
