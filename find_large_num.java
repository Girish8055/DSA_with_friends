package shhradha;
// import java.util.*;

public class find_large_num {

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;  //-infinity values
        int smallest = Integer.MAX_VALUE; // +infinity values

        for (int i=0; i <arr.length; i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }

            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        System.out.println("the smallest value is :" + smallest );
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,9,1,7,3,4};
        System.out.println("Largest value is: " + largest(arr));
    }
}
