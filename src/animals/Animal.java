package animals;

public abstract class Animal {
    protected String species;
    protected int age;
    protected String diet;

    public Animal(String species, int age, String diet) {
        this.species = species;
        this.age = age;
        this.diet = diet;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return species + " (age " + age + ", diet: " + diet + ")";
    }
}
