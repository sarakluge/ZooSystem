package animals;

public class Mammal extends Animal{
    private boolean hasFur;

    public Mammal(String species, int age, String diet, boolean hasFur) {
        super(species, age, diet);
        this.hasFur = hasFur;
    }

    public void giveBirt() {
        System.out.println("Congratulation! A " + "gave birth");
    }
}
