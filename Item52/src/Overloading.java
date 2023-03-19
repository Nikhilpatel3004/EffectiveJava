import java.math.BigInteger;
import java.util.*;
public class Overloading {

    public static String classify(Set<?> s){
        return "Set";
    }

    public static String Classify(List<?> list){
        return "List";
    }

    public static String classify(Collection<?> collection){
        return "Unknown Types";
    }


    public static void main(String[] args) {
        Collection<?> collection[] = {new HashMap<String,String>().values() ,new HashSet<String>() ,new ArrayList<BigInteger>() };

        for(Collection<?> c : collection){
            System.out.println(classify(c));
        }
    }
}
