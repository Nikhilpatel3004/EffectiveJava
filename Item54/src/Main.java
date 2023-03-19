import java.util.*;
public class Main {

    private  final List<Integer> numbers =  List.of(8,9,9) ;
    private static final Integer[] EMPTY_NUMBERS = new Integer[0];




    public Integer[] getnumbers(){
        return numbers.toArray(EMPTY_NUMBERS);
    }

    public static void main(String[] args) {

          Main m  = new Main();
        System.out.println(EMPTY_NUMBERS);
        System.out.println(m.getnumbers());

    }
}