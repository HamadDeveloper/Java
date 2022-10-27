package example1;

public class IncrementingThread extends Thread {
     Counter c = new Counter();
    public IncrementingThread (Counter c ){
        this.c = c;
    }
    public void run(){
        c.increment();
    }
}
