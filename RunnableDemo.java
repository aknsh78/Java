
class MyThread implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Akansha Kukshal Roll No:2400320100117");
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}