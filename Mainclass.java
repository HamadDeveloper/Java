public class Counter{
    private int count = 0;
    public void increment(){
        for (int i = 0 ; i<10000;i++)
            count++;
    }
    public int decrement(){
        for (int i = 0; i<10000; i++)
            count--;
    }
    public void display_count(){
        System.out.println(count);
    }
}
public  class IncrementingThread extends Thread{
    private int counter c;
    public IncrementingThread (counter c){
        this.c = c;

    }
    public void run(){
        c.increment();
    }
}
public class Mainclass {
    public static void main(String[] args) {
        counter  c = new Counter();
        IncrementingThread inc1 = new IncrementingThread(c);
        IncrementingThread inc2 = new IncrementingThread(c);
        inc1.start();
        inc2.start();
    }
}
