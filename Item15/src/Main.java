public class Main {


    //this is public and also final point to ref of arr so it can be mutable
    public static final Integer[] values = {8,9};


    //instead of that

    private static final Integer[] value = {8,9};
    public static final Integer[] getvalue(){
      return values.clone(); // not original copy
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}