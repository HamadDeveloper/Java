package example1;

public class DecrementingThread extends Thread {
    Counter c = new Counter();

    public DecrementingThread(Counter c) {
        this.c = c;
    }

    public void run() {
        c.decrement();
    }
}
