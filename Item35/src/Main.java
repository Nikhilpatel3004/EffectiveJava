public class Main {
    public static void main(String[] args) {


        // loop hole

        Numbers numbers = Numbers.THREE;

        int actualnumber = numbers.ActualNumber();

        System.out.println(actualnumber);



        //right way
        Number number = Number.FOUR;

        int actualnumber1 = number.getActualnumber();

        System.out.println(actualnumber1);
    }
}