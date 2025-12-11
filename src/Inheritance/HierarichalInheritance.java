package Inheritance;

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle honks");
    }
}

class Bus extends Vehicle{
    Bus(){
        System.out.println("Bus honks");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("Car honks");
    }
}

public class HierarichalInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Car car = new Car();

        Vehicle vehicleBus = new Bus();
        Vehicle vehicleCar = new Car();
    }
}
