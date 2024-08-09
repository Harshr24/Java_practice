/*
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        
        System.out.println("enter any positive integer");
        num = sc.nextInt();
        
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial is :" +fact);
    }
}
*/


public class Factorial {
    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        System.out.println(factorial(4));
    }
}