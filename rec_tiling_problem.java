package shhradha;

public class rec_tiling_problem {

    public static int tilingproblem (int n) { // 2 x n (floor size)
        //base case
        if (n==0 || n==1) {
            return 1;
        }
        //kaam to solve this problem

        //vertical choise
        int a =tilingproblem(n-1);

        //horizonatal choise
        int b = tilingproblem(n-2);

        int toways = a + b;
        return toways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(5));
    }
}
