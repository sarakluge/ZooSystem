import java.util.ArrayList;
import java.util.List;

public class Zookeeper {
    protected String name;
    protected List<Cage> responsibilities;

    public Zookeeper(String name) {
        this.name = name;
        this.responsibilities = new ArrayList<>();
    }

    public void addResposibility(Cage cage) {
        responsibilities.add(cage);
    }

    public void feedAssignesCages() {
        System.out.println(name + " is feeding assigned cages...");

        for (Cage cage : responsibilities) {
            System.out.println("Feeding animals in cage " + cage);
        }
    }
}
