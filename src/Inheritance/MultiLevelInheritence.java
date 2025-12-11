package Inheritance;

class Animals{
    Animals(){
        System.out.println("Animals makes sound");
    }
}

class Mammals extends Animals{
    Mammals(){
        //by default the Animals() constructor is called here
        System.out.println("Mammals makes sound");
    }
}

class Dogs extends Mammals{
    String dogSound = "woof";
    Dogs(){
        //by default the Animals() & Mammals() constructors is called here
        System.out.println("Dogs makes "+dogSound);
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
