package Pets.controller;

import Pets.model.Cat;
import Pets.model.Dog;
import Pets.model.Pet;

public class HouseAppl {
    public static void main(String[] args) {

        ///Задача 1. Создайте класс Pet (домашние животные) с полями:
        //
        //тип (кошка, собака, ...)
        //вес
        //условия проживания (дома, на улице)
        //Создайте дочерние классы Cat и Dog c дополнительными полями:
        //имя, порода, возраст. Создайте метод eat, sleep для обоих классов и метод run (гулять) для класса Dog.
        //Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
        //Создайте HouseAppl, в котором есть метод main.
        //Поселите в доме 2 собаки и 3 кошки.
        //Смоделируйте жизнь в этом доме в течение дня.


        Dog dog1 = new Dog("Собака", 10.5, "дома", "Бобик", "Лабрадор", 3);
        Dog dog2 = new Dog("Собака", 8.2, "дома", "Шарик", "Дворняга", 5);

        Cat cat1 = new Cat("Кошка", 3.5, "дома", "Мурка", "Персидская", 2);
        Cat cat2 = new Cat("Кошка", 4.1, "дома", "Барсик", "Сиамская", 4);
        Cat cat3 = new Cat("Кошка", 2.7, "дома", "Васька", "Британская", 1);

        Pet[] pets = {dog1, dog2, cat1, cat2, cat3};

        for (Pet pet : pets) {
            System.out.println("Животное: " + pet.getType());
            System.out.println("Вес: " + pet.getWeight() + " кг");
            System.out.println("Условия проживания: " + pet.getLivingConditions());
            pet.eat();
            pet.sleep();
            if (pet instanceof Dog) {
                ((Dog) pet).run();
            }
            if (pet instanceof Cat) {
                ((Cat) pet).voice();
            }
            System.out.println();
        }
    }
}
