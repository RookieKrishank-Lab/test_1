package my.thread;

//to stop thread from impacting the main thread we use demon thread 
//use case - garbage collection, mointor some resources, logging. for those cases we dont want to make our main thread wait
public class DemonThread {

    public static void main(String args[]){

        System.out.println("Main thread started");

        Thread objThread = new Thread(()->
        {
            System.out.println("Thread 1 is running ");
        });

        objThread.start();

        //efficient way to create thread is implementing Runnable

        Runnable objRunnable = () ->{
            //Runnable is SAM so whatever implementation is done it will be apply to run abstract method
            System.out.println("Thread 2 started");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 completed");
        };

        Thread objThread2 = new Thread(objRunnable, " Runnable Thread");
        objThread2.setDaemon(true);
        objThread2.start();

        System.out.println("Main thread ended");
    }
}
