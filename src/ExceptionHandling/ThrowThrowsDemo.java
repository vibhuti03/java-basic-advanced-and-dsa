package ExceptionHandling;

import java.io.InvalidObjectException;

public class ThrowThrowsDemo {
    public static void main(String[] args) {
        Resident r = new Resident("Budbak", 0);
        try {
            System.out.println(ThrowThrowsDemo.canVote(r));
        } catch (Exception e) {
            System.out.println("This resident is invalid");
        }
    }

    private static boolean canVote(Resident r) throws Exception
    {
        if(r.getAge()<=0){
            throw new InvalidObjectException("Age can't be less than 0");
        }
        else if(r.getAge()<18){
            return false;
        }
        return true;
    }
}
