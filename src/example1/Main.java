package example1;

public class Main {
    public static void main(String[] args) {

        Mythread t =  new Mythread();
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        t.start();
        t1.start();
        t2.start();

        for (int i = 0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+ "i=" +i);
        }

    }
}