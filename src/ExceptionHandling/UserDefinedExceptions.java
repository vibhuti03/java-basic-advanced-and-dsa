package ExceptionHandling;

import static java.lang.System.exit;

class InvalidResidentException extends RuntimeException{ //run-time user defined exception
    InvalidResidentException(){
        super("Age can't be less than 0");
    }
}

class InvalidOperationException extends Exception{ //compile-time user defined exception
    InvalidOperationException(String e){
        super(e);
    }
}


public class UserDefinedExceptions {
    public static void main(String[] args){
        Resident r = new Resident("Shyam", 0);
        try{
            int exactAge = r.getAge()/10;
            System.out.println(canVote(r));
        } catch(ArithmeticException e){
            System.out.println(e);
        } catch(InvalidResidentException e){
            System.out.println("Exception caught");
            exit(0);
        }
    }

    private static boolean canVote(Resident r) throws InvalidResidentException
    {
        if(r.getAge()<=0){
            throw new InvalidResidentException();
        }
        else if(r.getAge()<18){
            return false;
        }
        return true;
    }
}
