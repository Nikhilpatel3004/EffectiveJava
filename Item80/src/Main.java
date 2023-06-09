import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService =  Executors.newSingleThreadExecutor();



        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));


        System.out.println("Task3 started");
        for(int i =0;i<10;i++){
            System.out.println("Task3   " + i);
        }
        System.out.println("Task3 ended");

        executorService.shutdown();
    }
}