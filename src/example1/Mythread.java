package example1;

public class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i= " + i);
        }

    }


}
