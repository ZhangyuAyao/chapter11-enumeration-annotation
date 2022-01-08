package com.hspedu.annotation_;

public class Homework06 {
    public static void main(String[] args) {
        Person tangshen = new Person();
        tangshen.getVehicle();
        tangshen.changeVehicle(new Boat());
        tangshen.getVehicle();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("horse");
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("boat");
    }
}

class Factory {
    public Horse getHorse(){
        return new Horse();
    }

    public Boat getBoat(){
        return new Boat();
    }
}

class Person {
    private Vehicles vehicle;
    private final Factory factory = new Factory();

    public Person(){
        this.vehicle = factory.getHorse();
    }

    public void getVehicle(){
        vehicle.work();
    }

    public void changeVehicle(Vehicles vehicle) {
        this.vehicle = factory.getBoat();
    }


}