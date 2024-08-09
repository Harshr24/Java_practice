// public class sum {
//     public static void main(String args[]){
//         int a=5;
//         int b=6;
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }
// =================================================================================
import java.util.*;

public class sum {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}