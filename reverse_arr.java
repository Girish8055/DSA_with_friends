package shhradha;

public class reverse_arr {

    public static void reverse(int numbers[]) {
        int first = 0, last =numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5,2,3,9,8,4,7} ;

        reverse(numbers);
        for( int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]+ " ");
        }
        System.out.println();
    }
}
