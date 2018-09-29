package com.robbuican;

public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(int name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
