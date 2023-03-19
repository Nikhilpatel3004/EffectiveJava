import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(78);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {

        assert age<100;
        if(age < 0){
            throw  new AgeLessThanZeroException("Age cannot be negative");
//            throw new AgeLessThanZeroException(new RuntimeException());
         }

        System.out.println("nikhil");
    }
}

//checked Exception Exception will be extend
//unchecked Exception RunTimeException will be extend