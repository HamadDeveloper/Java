package example1;

public class Counter {
    private  int count= 0;
    public void increment(){
        for (int i =0 ; i<10000; i++)
            count++;
    }
    public void decrement(){
        for (int i  =0 ; i<10000;i--){
            count--;
        }
    }
    public void display_count(){
        System.out.println("the value of count is :" + count);
    }
}
