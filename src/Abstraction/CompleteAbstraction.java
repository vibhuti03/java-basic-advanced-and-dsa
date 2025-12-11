package Abstraction;

interface Shapes{

    // The below methods are by default abstract, hence no need to use the keyword abstract while declaring them
    int area(int length, int breadth);
    int perimeter(int length, int breadth);

//    Notice how interface can't have methods that are implemented
//    int diagonal(int length, int breadth){
//    }
}

class Square implements Shapes{

    @Override
    public int area(int length, int breadth) {
        return length*breadth;
    }

    @Override
    public int perimeter(int length, int breadth) {
        return 2 * (length+breadth);
    }
}

public class CompleteAbstraction {
    public static void main(String[] args) {

    }
}
