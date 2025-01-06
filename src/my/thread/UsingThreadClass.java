package my.thread;

class MyThread extends Thread {
    /*@Override
    public void run() {
        System.out.println("Thread is running...");
    }*/

    public void run(String string) {
        System.out.println("Argument Thread is running...");
    }
}

public class UsingThreadClass {
    public static void main(String[] args) {
        System.out.println("Start my.thread...");
        MyThread thread = new MyThread();
        thread.start();
        thread.run("s");
        System.out.println("End my.thread...");
    }

}
