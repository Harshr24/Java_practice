abstract class Animal {
    abstract public void walk() ;
}
class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("walks in 2 legs");
    }
}
public class Abstraction {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}
