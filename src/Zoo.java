import animals.Animal;
import animals.Bird;
import animals.Mammal;
import animals.Reptile;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Zookeeper> zookeepers;
    private List<Animal> animals;
    private List<Cage> cages;

    public Zoo() {
        this.zookeepers = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.cages = new ArrayList<>();
    }

    public List<Zookeeper> getZookeepers() {
        return zookeepers;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Cage> getCages() {
        return cages;
    }

    public void addZookeeper(Zookeeper zookeeper) {
        zookeepers.add(zookeeper);
    }

    public void addCage(Cage cage) {
        cages.add(cage);
    }

    public void showZooStatus() {
        System.out.println("\n=== Zoo Status ===");

        long birds = animals.stream().filter(a -> a instanceof Bird).count();
        long mammals = animals.stream().filter(a -> a instanceof Mammal).count();
        long reptiles = animals.stream().filter(a -> a instanceof Reptile).count();

        System.out.println("Birds: " + "🐦 ".repeat((int) birds));
        System.out.println("Mammals: " + "🦁 ".repeat((int) mammals));
        System.out.println("Reptiles: " + "🐍 ".repeat((int) reptiles));

        for (Cage cage : cages) {
            cage.showCageStatus();
        }

        System.out.println("=================\n");
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println("\n🦁 Current Animals in the Zoo 🐍🦜🦖:");
        if (animals.isEmpty()) {
            System.out.println("  No animals yet. Add some!");
        } else {
            int index = 1;
            for (Animal animal : animals) {
                System.out.println("  " + index + ". " + animal);
                index++;
            }
        }
    }

    public void showCages() {
        System.out.println("\n🏠 Current Cages:");
        if (cages.isEmpty()) {
            System.out.println("  No cages created yet.");
        } else {
            int index = 1;
            for (Cage cage : cages) {
                System.out.println("  " + index + ". " + cage);
                index++;
            }
        }
    }

    public void showZookeepers() {
        System.out.println("\n👩‍🌾 Zookeepers on duty:");
        if (zookeepers.isEmpty()) {
            System.out.println("  No zookeepers yet.");
        } else {
            int index = 1;
            for (Zookeeper zookeeper : zookeepers) {
                System.out.println("  " + index + ". " + zookeeper);
                index++;
            }
        }
    }
}
