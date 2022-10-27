package example1;

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i= " + i);
//            System.out.println("I am happy");
        }
    }

}

class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i= " + i);
//            System.out.println("now i am boor");
        }
    }
}

public class MyThread1 {
    public static void main(String[] args) {

        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread3 t4 = new MyThread3();
        t2.start();
        t3.start();
        t4.start();

    }
}
