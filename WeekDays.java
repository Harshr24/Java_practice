import java.util.Scanner;

public class WeekDays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit in between 1 to 7 : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '1' : System.out.println("monday");
            break;
            case '2' : System.out.println("tuesday");
            break;
            case '3' : System.out.println("wednesday");
            break;
            case '4' : System.out.println("thrusday");
            break;
            case '5' : System.out.println("friday");
            break;
            case '6' : System.out.println("saturday");
            break;
            case '7' : System.out.println("sunday");
            break;
            default : System.out.println("wront input");
        }
    }
}
