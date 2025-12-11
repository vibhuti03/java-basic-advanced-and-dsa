package Inheritance;

class Animal{
    Animal(){
        System.out.println("Inheritance.Animal makes sound");
    }
}

class Dog extends Animal{
    String dogSound = "woof";
    Dog(){
        //by default the Inheritance.Animal() constructor is called here
        System.out.println("Inheritance.Dog makes "+dogSound);
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animalDog = new Dog(); //equivalent to initializing a Inheritance.Dog object
//        Inheritance.Dog dogAnimal = new Inheritance.Animal(); //no possible
    }
}
