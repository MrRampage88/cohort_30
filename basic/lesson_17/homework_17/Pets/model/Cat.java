package Pets.model;

public class Cat extends Pet {
    private String name;
    private String breed;
    private int age;

    public Cat(String type, double weight, String livingConditions, String name, String breed, int age) {
        super(type, weight, livingConditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void voice() {
        System.out.println("Мяу!");
    }
}