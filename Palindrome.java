import java.util.Scanner;

public class Palindrome {

    public static boolean ispalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int reminder = palindrome % 10;
            reverse = reverse * 10 + reminder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(ispalindrome(palindrome)) {
            System.out.println("number : " + palindrome + " is a palindrome ");
        } 
        else {
            System.out.println("number : " + palindrome + " is not a palindrome ");
        }
    }

    
}
