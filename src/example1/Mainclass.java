package example1;

public class Mainclass {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        IncrementingThread inc = new IncrementingThread(c);
        DecrementingThread dec = new DecrementingThread(c);
        inc.join();
        dec.join();

        inc.start();
        dec.start();
        c.display_count();
    }
}
