public class starpattern {
    public static void main(String[] args) {
        int rows = 15; // Change this value to adjust the size of the triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
