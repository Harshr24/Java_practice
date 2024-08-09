import java.util.Scanner;

public class Tcost {
    public  static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the cost of a pencil");
            float a = sc.nextFloat();
            System.out.println("enter the cost of a pen");
            float b = sc.nextFloat();
            System.out.println("enter the cost of an eraser");
            float c = sc.nextFloat();
            float cost = a + b + c;
            float tcost = cost  +  (a + b + + c)*18/100;

            System.out.print(tcost);
            System.out.print(" Rs");
        } 
    }
}
