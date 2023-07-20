package shhradha;

public class rec_power_of_2 {

    public static int power (int n) {
        if (n==0) {
            return 1;
        }

        int sp = power(n-1);
        int bp = 2 * sp;

        return bp;
    }
    public static void main(String[] args) {
           int n=3;
        System.out.println(power(n));
    }
}
