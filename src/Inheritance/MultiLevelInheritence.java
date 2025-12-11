package Inheritance;

class Animals{
    Animals(){
        System.out.println("Inheritance.Animals makes sound");
    }
}

class Mammals extends Animals{
    Mammals(){
        //by default the Inheritance.Animals() constructor is called here
        System.out.println("Inheritance.Mammals makes sound");
    }
}

class Dogs extends Mammals{
    String dogSound = "woof";
    Dogs(){
        //by default the Inheritance.Animals() & Inheritance.Mammals() constructors is called here
        System.out.println("Inheritance.Dogs makes "+dogSound);
    }

}

public class MultiLevelInheritence {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Mammals mammals = new Mammals();
        Dogs dog = new Dogs();

        Animals animalMammal = new Mammals();
        Mammals mammalsDog = new Dogs();
        Animals animalDog = new Dogs();
    }
}
