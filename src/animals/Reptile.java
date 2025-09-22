package animals;

public class Reptile extends Animal{
    private boolean isVenomous;

    public Reptile(String species, int age, String diet, boolean isVenomous) {
        super(species, age, diet);
        this.isVenomous = isVenomous;
    }

    public void shedSkin() {
        System.out.println(species + " shed its skin");
    }

    @Override
    public String toString() {
        return super.toString() + (isVenomous ? ", venomous" : ", not venomous");
    }
}
