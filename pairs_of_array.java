package shhradha;

public class pairs_of_array {
    public static void printpairs (int numbers[]) {
        int total_num_of_pairs=0;
        for (int i=0; i< numbers.length; i++) {
            int current_num = numbers[i]; //1,2,3,4,5
            for (int j=i+1; j< numbers.length; j++){
                System.out.println("(" + current_num + "," + numbers[j] + ")");
                total_num_of_pairs ++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pairs: " + total_num_of_pairs);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        printpairs(numbers);
    }
}
