package ru.Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.drinkMilk();
        System.out.println("Имя кошки - " + cat1.catName("Барсик"));
    }
}
