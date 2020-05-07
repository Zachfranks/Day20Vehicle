package com.company;

import java.util.Random;
public class Main {

    //the class
    private static com.company.Car x;
    private static com.company.Car y;


    public static void main(String[] args) {

        //random varubles for car1
        int ranDoors = (int)(Math.random()*3+1);
        int carSpeed = (int)(Math.random()*139+1);

        //random varuble for car2
        int ranDoors2 = (int)(Math.random()*2);
        int carSpeed2 = (int)(Math.random()*199+1);

        //objects in the first car
        x = new com.company.Car();
        x.setCarNum(1);
        x.setPlate("3H1R5V");
        x.setCarColour("gray");
        x.setDoorCar(ranDoors);
        x.setSpeed(0);
        x.setMaxSpeed(carSpeed);

        //displaying first car
        System.out.println("Car number: " + x.CarNum());
        System.out.println("Plate number: " + x.Plate());
        System.out.println("Car colour: " + x.CarColour());
        System.out.println("number of doors: "+ x.DoorCar());
        System.out.println("Speed: " + x.Speed());
        System.out.println("Top speed: " + x.MaxSpeed());

        //objecs in the second car
        y = new com.company.Car();
        y.setCarNum(2);
        y.setPlate("K1H7B4");
        y.setCarColour("Green");
        y.setDoorCar(ranDoors2);
        y.setSpeed(10);
        y.setMaxSpeed(carSpeed2);

        //displaying second car
        System.out.println("Car number: " + y.CarNum());
        System.out.println("Plate number: " + y.Plate());
        System.out.println("Car colour: " + y.CarColour());
        System.out.println("number of doors: "+ y.DoorCar());
        System.out.println("Speed: " + y.Speed());
        System.out.println("Top speed: " + y.MaxSpeed());
    }
}
