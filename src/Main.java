import animals.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Zoo zoo = new Zoo();

    public static void main(String[] args) {
        defaultData();

        boolean runMainMenu = true;

        while (runMainMenu) {
            System.out.println("\n╔═══════════════════════════╗");
            System.out.println("🦓  WELCOME TO THE ZOO APP  🦒");
            System.out.println("╚═══════════════════════════╝");
            zoo.showZooStatus();
            System.out.println("\n=== Zoo Management Menu ===");
            System.out.println("1️⃣  Show all animals");
            System.out.println("2️⃣  Show all cages");
            System.out.println("3️⃣  Show all zookeepers");
            System.out.println("4️⃣  Add animal");
            System.out.println("5️⃣  Add cage");
            System.out.println("6️⃣  Add zookeeper");
            System.out.println("7️⃣  Assign cage to zookeeper");
            System.out.println("8️⃣  Let zookeeper feed animals");
            System.out.println("9️⃣  Use animal special ability");
            System.out.println("0️⃣  Exit");
            System.out.println("----------------------------");
            System.out.print("👉 Choose option: ");
            String choice = scanner.nextLine();


            switch (choice) {
                case "1": zoo.showAnimals(); break;
                case "2": zoo.showCages(); break;
                case "3": zoo.showZookeepers(); break;
                case "4": addAnimalToZoo(); break;
                case "5": addCageToZoo(); break;
                case "6": addZookeeperToZoo(); break;
                case "7": assignCageToZookeeper(); break;
                case "8": feedAnimals(); break;
                case "9": animalActionMenu(); break;
                case "0": runMainMenu = false; break;
                default: System.out.println("Invalid choice.");
            }
        }
        System.out.println("Goodbye!");
    }

    private  static void addAnimalToZoo() {
        boolean runAnimalMenu = true;

        while (runAnimalMenu) {
            System.out.println("\n=== Add Animal Menu ===");
            System.out.println("1. Bird");
            System.out.println("2. Mammal");
            System.out.println("3. Reptile");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                runAnimalMenu = false;
                continue;
            }

            System.out.print("Species: ");
            String species = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Diet: ");
            String diet = scanner.nextLine();

            Animal animal = null;

            switch (choice) {
                case 1 -> {
                    System.out.print("Wingspan (m): ");
                    double wingspan = scanner.nextDouble();
                    scanner.nextLine();
                    animal = new Bird(species, age, diet, wingspan);
                }
                case 2 -> {
                    System.out.print("Has fur? (true/false): ");
                    boolean hasFur = Boolean.parseBoolean(scanner.nextLine());
                    animal = new Mammal(species, age, diet, hasFur);
                }
                case 3 -> {
                    System.out.print("Is venomous? (true/false): ");
                    boolean venomous = Boolean.parseBoolean(scanner.nextLine());
                    animal = new Reptile(species, age, diet, venomous);
                }
                default -> System.out.println("Invalid choice, try again!");
            }

            if (animal != null) {
                zoo.addAnimal(animal);
                System.out.println("Animal added: " + animal);
            }
        }
    }

    private static void addCageToZoo() {
        System.out.println("Cage name: ");
        String name = scanner.nextLine();
        System.out.println("Size: ");
        String size = scanner.nextLine();
        System.out.println("Capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Cage cage = new Cage(name, size, capacity);
        zoo.addCage(cage);
        System.out.println("Cage added: " + name);
    }

    private static void addZookeeperToZoo() {
        System.out.print("Zookeeper name: ");
        String name = scanner.nextLine();
        Zookeeper zookeeper = new Zookeeper(name);
        zoo.addZookeeper(zookeeper);
        System.out.println("Zookeeper " + name + " added.");
    }

    private static void assignCageToZookeeper() {
        zoo.showZookeepers();
        System.out.println("Choose zookeeper number: ");
        int zookeeperIndex = scanner.nextInt() -1;
        scanner.nextLine();

        zoo.showCages();
        System.out.println("Choose cage number: ");
        int cageIndex = scanner.nextInt() -1;
        scanner.nextLine();

        Zookeeper zookeeper = zoo.getZookeepers().get(zookeeperIndex);
        Cage cage = zoo.getCages().get(cageIndex);

        zookeeper.addResponsibility(cage);
        System.out.println("Assigned cage " + cage + " to " + zookeeper.getName());
    }

    private static void feedAnimals() {
        zoo.showZookeepers();
        System.out.print("Choose zookeeper number: ");
        int zookeeperIndex = scanner.nextInt() -1;
        scanner.nextLine();

        Zookeeper zookeeper = zoo.getZookeepers().get(zookeeperIndex);
        zookeeper.feedAssignedCages();
    }

    private static void animalActionMenu() {
        System.out.println("\n🎯 Choose an animal to perform its special ability:");
        zoo.showAnimals();
        System.out.print("Choose animal number: ");
        int index = scanner.nextInt() -1;
        scanner.nextLine();

        if (index < 0 || index >= zoo.getAnimals().size()) {
            System.out.println("Invalid animal index.");
            return;
        }

        Animal animal = zoo.getAnimals().get(index);

        switch (animal) {
            case Bird bird -> bird.fly();
            case Mammal mammal -> mammal.giveBirth();
            case Reptile reptile -> reptile.shedSkin();
            case null, default -> System.out.println("No special action for this animal.");
        }
    }

    private static void defaultData() {
        Cage reptileCage = new Cage("Reptile House", "Medium", 5);
        Cage birdCage = new Cage("Aviary", "Large", 10);
        Cage mammalCage = new Cage("Savannah", "Large", 8);
        Cage smallCage = new Cage("Small Pet Cage", "Small", 3);

        zoo.addCage(reptileCage);
        zoo.addCage(birdCage);
        zoo.addCage(mammalCage);
        zoo.addCage(smallCage);

        Animal cobra = new Reptile("Cobra", 4, "Carnivore", true);
        Animal python = new Reptile("Python", 6, "Carnivore", false);
        Animal parrot = new Bird("Parrot", 2, "Herbivore", 0.4);
        Animal eagle = new Bird("Eagle", 3, "Carnivore", 2.0);
        Animal lion = new Mammal("Lion", 5, "Carnivore", true);
        Animal tiger = new Mammal("Tiger", 4, "Carnivore", true);
        Animal rabbit = new Mammal("Rabbit", 1, "Herbivore", false);

        reptileCage.addAnimalToCage(cobra);
        reptileCage.addAnimalToCage(python);
        birdCage.addAnimalToCage(parrot);
        birdCage.addAnimalToCage(eagle);
        mammalCage.addAnimalToCage(lion);
        mammalCage.addAnimalToCage(tiger);
        smallCage.addAnimalToCage(rabbit);

        zoo.addAnimal(cobra);
        zoo.addAnimal(python);
        zoo.addAnimal(parrot);
        zoo.addAnimal(eagle);
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(rabbit);

        Zookeeper alice = new Zookeeper("Alice");
        alice.addResponsibility(reptileCage);
        Zookeeper bob = new Zookeeper("Bob");
        bob.addResponsibility(birdCage);
        Zookeeper cecilia = new Zookeeper("Cecilia");
        cecilia.addResponsibility(mammalCage);
        Zookeeper david = new Zookeeper("David");
        david.addResponsibility(smallCage);

        zoo.addZookeeper(alice);
        zoo.addZookeeper(bob);
        zoo.addZookeeper(cecilia);
        zoo.addZookeeper(david);
    }
}