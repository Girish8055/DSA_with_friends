package shhradha;

public class fibonacci {

    public static int fib (int n) {
        if (n==0 || n==1) {
            return n;
        }
        int fibo = fib(n-1) + fib(n-2);

        return fibo;
    }

    public static void main(String[] args) {
        int n = 50;
        for (int i = 0; i <= n; i++) {

            System.out.print(fib(i) + " ");
        }
        // System.out.println(fib(n));

    }
}
