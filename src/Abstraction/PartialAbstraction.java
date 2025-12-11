package Abstraction;

abstract class Animal{

    abstract void makeSound();

    void move() { //abstract class needs minimum 1 abstract method, other methods can be implemented
        System.out.println("Animal moves");
    }
}

class Dog extends Animal{ //Dog could have inherited from Mammal and Mammal could also have been abstract

    @Override
    void makeSound() { //Since parent class is abstract, child has to provide implementation of the abstract methods
        System.out.println("Woof Woof");
    }
}

public class PartialAbstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.move(); //inherited method hence available to child class' object
    }
}
