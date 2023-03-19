import java.util.concurrent.TimeUnit;

public class stopThread2 {

    private static boolean stopRequeste;

    private static synchronized void RequestStop(){
        stopRequeste = true;
    }
    private static synchronized boolean StopRequeste(){
          return stopRequeste;
    }


    public static void main(String[] args) throws InterruptedException {
        Thread subthread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while(!StopRequeste()){
                    System.out.println(i);
                    i++;
                }
            }
        });

        subthread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Nikhil");
        RequestStop();
    }
}
