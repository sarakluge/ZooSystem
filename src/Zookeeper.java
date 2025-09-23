import java.util.ArrayList;
import java.util.List;

public class Zookeeper {
    private String name;
    private List<Cage> responsibilities;

    public Zookeeper(String name) {
        this.name = name;
        this.responsibilities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addResponsibility(Cage cage) {
        responsibilities.add(cage);
    }

    public void feedAssignedCages() {
        if (responsibilities.isEmpty()) {
            System.out.println("\n" + name + " has no cages to feed. 😅");
            return;
        }

        System.out.println("\n👩‍🌾 " + name + " is adding food to assigned cages... 🍏🥩🥕");
        for (Cage cage : responsibilities) {
            cage.addFood();
        }
    }

    public void cleanAssignedCages() {
        System.out.println("\n" + name + " is cleaning assigned cages...");
        for (Cage cage : responsibilities) {
            cage.cleanCage();
        }
    }

    public void showAssignedCages() {
        System.out.println("\n" + name + "'s assigned cages:");
        for (Cage cage : responsibilities) {
            cage.showCageStatus();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);

        if (responsibilities.isEmpty()) {
            sb.append(" (no cages assigned)");
        } else {
            sb.append(" (responsible for: ");
            for (int i = 0; i < responsibilities.size(); i++) {
                sb.append(responsibilities.get(i).getName());
                if (i < responsibilities.size() - 1) sb.append(", ");
            }
            sb.append(")");
        }
        return sb.toString();
    }

}
