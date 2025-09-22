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
        System.out.println("All animals in the zoo:");
        for (Animal animal : animals) {
            System.out.println(" - " + animal);
        }
    }

    public void showCages() {
        System.out.println("Cages in the zoo:");
        for (Cage cage : cages) {
            cage.showAnimals();
        }
    }

}
