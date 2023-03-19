public class Task2 extends Thread {

    public void run(){
        System.out.println("TASK2 started");

        for(int i =0;i<10;i++){
            System.out.println("TASK2   " + i);
        }
        System.out.println("TASK2 Ended");
    }
}
