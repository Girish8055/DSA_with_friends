package shhradha;

public class rec_power_func {
    public static int powerfunction (int x,int n ) {
        if (n == 0) {
            return 1;
        }
        return x * powerfunction(x, n - 1);
    }
        public static void main(String[] args){
            System.out.println(powerfunction(2,10));
        }

    }

