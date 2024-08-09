import java.util.Scanner;

public class Asquare {
    public  static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            float side = sc.nextFloat();
            float area = side * side;  
            System.out.println("the area is " +area);
        }  
    }
}
