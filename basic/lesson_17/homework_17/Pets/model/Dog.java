package Pets.model;

public class Dog extends Pet {
    private String name;
    private String breed;
    private int age;

    public Dog(String type, double weight, String livingConditions, String name, String breed, int age) {
        super(type, weight, livingConditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void voice() {
        System.out.println("Гав-гав!");
    }

    public void run() {
        System.out.println("Собака гуляет.");
    }
}