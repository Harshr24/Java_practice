import java.util.Scanner;

public class PrintN1to10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        int counter = 1;
        while(counter <= n){
        System.out.print( counter);
        counter++;
        }
    }

    
}
