package Encapsulation;

class Animal{
    private String name; //private hence won't be accessible directly, outside the class
    private String type;
    private int numberOfLegs;

    public String getName() {
        return name; // since the property is not accessible directly, a getter has been set up to access the property
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}

public class GetterSetter {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Wolf");
        animal.setType("wild");
        animal.setNumberOfLegs(4);

        System.out.println(animal.getName() + "is a " +animal.getType()+ " animal with " + animal.getNumberOfLegs() + " legs");
    }
}
