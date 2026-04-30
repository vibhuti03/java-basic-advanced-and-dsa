package ExceptionHandling;

class Resident{
    String name;
    int age;

    Resident(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class BasicTryCatchFinally {
    private boolean canVote(Resident resident){
        try{
            //even if I return true here, the response will still be false due to finally block
            int a = resident.getAge()/0; //goes to catch
            if( a > 18){
                return true;
            }
            return false;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            return false;
        }
    }

    public static void main(String[] args) {
        Resident r1 = new Resident("Mohan",1);
        BasicTryCatchFinally ob = new BasicTryCatchFinally();
        System.out.println(ob.canVote(r1));
    }
}
