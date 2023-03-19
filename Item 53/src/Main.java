public class Main {

    static  int mini(int first , int... remainingargues){
         int mini = first;

         for(int r : remainingargues){
             mini = Math.min(mini,r);
         }
         return mini;
    }
    public static void main(String[] args) {
        System.out.println(mini(76,98,90,76,98,65,34,76));
    }
}