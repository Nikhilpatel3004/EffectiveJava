import java.util.concurrent.TimeUnit;

public class stopThread {
    public static /*volatile*/ boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread subthread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;

                while(!stopRequested){
                    System.out.println(i);
                    i++;
                }
            }
        });

        subthread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Nikhil");
        stopRequested = true;
    }
}
