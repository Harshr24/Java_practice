import java.util.Scanner;

public class P_iveN_ive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("positive");
        }
        else if(number < 0){
            System.out.println("negative");
        }
        else if(number == 0){
            System.out.println("zero");
        }
        
    }
}
