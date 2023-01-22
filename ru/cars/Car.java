package ru.cars;

public class Car{
    String color;
    String type;
    int year;
    public void firstStart(){
        System.out.println("Автомобиль заведен");
    }
    public void turnOffCar(){
        System.out.println("Автомобиль заглушен");
    }
    public int yearCar(int year){
        this.year = year;
        return this.year;
    }
    public String typeCar(String type){
        this.type = type;
        return this.type;
    }
    public String colorCar(String color){
        this.color = color;
        return this.color;
    }
}
