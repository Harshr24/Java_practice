public class XpowerN {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }
    public static int optmizedPower(int a, int n) {
        if(n == 0){
            return 1;
        }
        int halfPowerSq = optmizedPower(a, n/2) * optmizedPower(a, n/2);

        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String arge[]) {
        
        System.out.println(power(2, 10));
        System.out.println(optmizedPower(2, 10));
        
    }
}

