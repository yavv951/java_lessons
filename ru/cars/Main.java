package ru.cars;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.color);
        car1.firstStart();
        car1.turnOffCar();
        System.out.println("Автомобиль года выпуска - " + car1.yearCar(2010));
        System.out.println("Тип автомобиля - " + car1.typeCar("Грузовик"));
        System.out.println("Цвет автомобиля - " + car1.colorCar("Красный"));
    }
}
