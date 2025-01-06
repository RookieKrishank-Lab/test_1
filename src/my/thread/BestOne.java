package my.thread;


class BaseClass1 {
    public void method1() {
        System.out.println("Method from BaseClass1");
    }
}

class MyRunnable extends BaseClass1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        method1(); // Accessing method from BaseClass1
    }
}

public class BestOne {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

