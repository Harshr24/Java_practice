class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }
    public static void printInfo(int age) {
        System.out.println(age);
    }
    public static void printInfo(String name ,int age) {
        System.out.println(name +" "+ age);
    }
}
public class OOPS2 {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue"; 
        pen1.type = "gel";
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        System.out.println("----------------------------");

        Student s1 = new Student();
        s1.name = "naveen";
        s1.age = 20;

        s1.printInfo(s1.name);
    }
}
