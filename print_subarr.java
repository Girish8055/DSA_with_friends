package shhradha;

public class print_subarr {
    public static void printsubarray(int numbers[]) {
         int ts=0;
        for ( int i=0; i< numbers.length; i++) {
            int start = i;
            for(int j=0; j< numbers.length; j++) {
                int end = j;
                for (int k=start; k<=end; k++) {
                    System.out.print(numbers[k]+ " "); //subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total numbers: "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printsubarray(numbers);
    }
}
