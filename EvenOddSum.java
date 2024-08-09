import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("enter the number");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            }
            else {
                oddSum += number;
            }

            System.out.println("press 1 for continue or 0 for exit");
            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("sum of even number : " +evenSum);
        System.out.println("sum of odd number : " +oddSum);
    }
}
