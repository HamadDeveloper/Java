package example1;

class Employee {
    int salary;
    String name;

    public int getnSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
    class CellPhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrat(){
        System.out.println("vibrate...");
    }
    public void callFriend(){
        System.out.println("call to mudassir");
    }
    }

public class Practice_Custom_class {
    public static void main(String[] args) {
//        Employee e = new Employee();
//        e.setName("Hamad ur rehman");
//        System.out.println(e.getName());
//        e.salary = 130000;
//        System.out.println(e.salary);

        CellPhone vivo = new CellPhone();
        vivo.vibrat();
        vivo.ring();
        vivo.callFriend();

    }
}
