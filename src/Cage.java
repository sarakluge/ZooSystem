import animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private String size;
    private int capacity;
    private List<Animal> animals;

    public Cage(String name, String size, int capacity) {
        this.name = name;
        this.size = size;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAnimalToCage(Animal animal) {
        if (animals.size() < capacity) {
            animals.add(animal);
            System.out.println(animal.getSpecies() + " added to cage " + name);
        } else {
            System.out.println("Cage " + name + " is full!");
        }
    }

    public void showAnimals() {
        System.out.println("Cage " + name + " contains: ");
        for (Animal animal : animals) {
            System.out.println(" - " + animal);
        }
    }

    @Override
    public String toString() {
        return name + " (" + size + ", capacity=" + capacity + ")";
    }
}
