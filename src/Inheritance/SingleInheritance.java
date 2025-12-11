package Inheritance;

class Animal{
    Animal(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    String dogSound = "woof";
    Dog(){
        //by default the Animal() constructor is called here
        System.out.println("Dog makes "+dogSound);
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animalDog = new Dog(); //equivalent to initializing a Dog object (animalDog is a reference to Dog object)
//        Dog dogAnimal = new Animal(); //no possible
    }
}
