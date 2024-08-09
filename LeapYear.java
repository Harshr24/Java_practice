import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year to check if it is a leap year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        // if the year is divisible by 400, it is a leap year
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            // if the year is divisible by 4 but not by 100, it is a leap year
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}