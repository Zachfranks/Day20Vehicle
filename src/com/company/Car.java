package com.company;

public class Car {

    //varubles
    private int firstCar;
    private String plateNum;
    private String colour;
    private int doors;
    private int curSpeed;
    private int Speed;

    Car(){
         int x = 1;
    }

    //sending thme back
    public int CarNum(){
        return firstCar;
    }
    public String Plate(){
        return plateNum;
    }
    public String CarColour(){
        return colour;
    }
    public int DoorCar(){
        return doors;
    }
    public int Speed(){
        return curSpeed;
    }
    public int MaxSpeed(){
      return Speed;
    }

    //assinging objects to a varible
    public void setCarNum(int NewValue){
        firstCar = NewValue;
    }
    public void setPlate(String NewValue){
        plateNum = NewValue;
    }
    public void setCarColour(String NewValue){
        colour = NewValue;
    }
    public void setDoorCar(int NewValue){
         doors = NewValue;
    }
    public void setSpeed(int NewValue){
        curSpeed = NewValue;
    }
    public void setMaxSpeed(int NewValue){
        Speed = NewValue;
    }
}
