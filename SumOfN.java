import java.util.Scanner;

public class SumOfN {
     public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= n){
            sum += counter;
            counter++;
        }
         System.out.println(sum);
    }
}
