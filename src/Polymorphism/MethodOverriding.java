package Polymorphism;

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    //A default constructor will be created whose first line will automatically call the parent class

    String dogSound = "woof";

    @Override //Good practice to annotate while overriding - not necessary to do so
    void makeSound(){
        System.out.println("Dog makes "+dogSound);
    }

}


public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("This is an example of runtime polymorphism or dynamic polymorphism or late binding");
        System.out.println("Since in method overriding the attaching of implementation to the method name happens during runtime, it is called late binding\n");


        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Animal ad = new Dog(); //ad is a reference object of dog
        ad.makeSound(); //Dog.makeSound() is being called

    }
}
