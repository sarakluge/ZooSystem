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

    public void addAnimalToCage(Animal animal) {
        if (animals.size() < capacity) {
            animals.add(animal);
            System.out.println(animal.getSpecies() + " added to cage " + name);
        } else {
            System.out.println("Cage " + name + " is full!");
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

    public void addFood() {
        food += 3;
        System.out.println(3 + " food added to " + name + " 🥕");
    }

    public void cleanCage() {
        waste = 0;
        System.out.println("Cage " + name + " has been cleaned 🧹");
    }

    public void nextDay() {
        int foodEaten = (int)(Math.random() * (food + 1));
        food -= foodEaten;

        int wasteIncrease = (int)(Math.random() * 4);
        waste = Math.min(10, waste + wasteIncrease);
    }

    @Override
    public String toString() {
        return name + " (" + size + ", capacity=" + capacity + ")";
    }
}
