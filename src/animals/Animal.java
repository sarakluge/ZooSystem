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

    public int getAge() {
        return age;
    }

    public String getDiet() {
        return diet;
    }

    @Override
    public String toString() {
        return species + " (age " + age + ", diet: " + diet + ")";
    }
}
