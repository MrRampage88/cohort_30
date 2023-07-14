package Pets.model;

public class Pet {
    private String type;
    private double weight;
    private String livingConditions;

    public Pet(String type, double weight, String livingConditions) {
        this.type = type;
        this.weight = weight;
        this.livingConditions = livingConditions;
    }

    public void eat() {
        System.out.println("Животное ест.");
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String getLivingConditions() {
        return livingConditions;
    }
}
