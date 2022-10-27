package example1;

class Custom{
    int id;
    String name;
    public void printDetail(){
        System.out.println("The id of student is :" +id);
        System.out.println("The name of student is " + name);
    }

}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is our first custom class");


        Custom c = new Custom();
        Custom c1 = new Custom();
        Custom c3 = new Custom();

        c3.id=14;
        c3.name="Hamad";
        c1.id=15;
        c1.name="mudassir";
        c.id=16;
        c.name="waqas";
        c1.printDetail();
        c.printDetail();
        c3.printDetail();

    }
}
