import animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private String size;
    private int capacity;
    private List<Animal> animals;
    private int food;
    private int waste;

    public Cage(String name, String size, int capacity) {
        this.name = name;
        this.size = size;
        this.capacity = capacity;
        this.animals = new ArrayList<>();
        this.food = 0;
        this.waste = 0;
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimals() {
        return animals;
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

    public void showCageStatus() {
        System.out.println("\n🏠 Cage: " + name + " (" + size + ")");
        System.out.println("Food: " + "🥕".repeat(food));
        System.out.println("Waste: " + "💩".repeat(waste));
        System.out.println("Animals: ");
        for (Animal animal : animals) {
            System.out.println(" - " + animal.getSpecies());
        }
    }

    @Override
    public String toString() {
        return name + " (" + size + ", capacity=" + capacity + ")";
    }
}
