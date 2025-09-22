package animals;

public class Bird extends Animal{
    private double wingspan;

    public Bird(String species, int age, String diet, double wingspan) {
        super(species, age, diet);
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println("A bird is flying");
    }
}
