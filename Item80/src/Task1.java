public class Task1  extends Thread{
     public void run(){
         System.out.println("TASK1 started");

         for(int i =0;i<10;i++){
             System.out.println("TASK1  " + i);
         }

         System.out.println("Task1 ended");
     }
}
