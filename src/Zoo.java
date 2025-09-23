import animals.Animal;
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

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println("=== Animals ===");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i));
        }
    }

    public void showCages() {
        System.out.println("=== Cages ===");
        for (int i = 0; i < cages.size(); i++) {
            System.out.println((i + 1) + ". " + cages.get(i).getName());
        }
    }

    public void showZookeepers() {
        System.out.println("=== Zookeepers ===");
        for (int i = 0; i < zookeepers.size(); i++) {
            System.out.println((i + 1) + ". " + zookeepers.get(i).getName());
        }
    }
}
