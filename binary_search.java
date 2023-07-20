package shhradha;

public class binary_search {

    public static int binarysearch( int arr[], int key ){
        int start = 0, end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key ){
                return mid;
        }
            if (arr[mid] < key){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,8,3,6,4,9,7,1};
         int key = 5;

        System.out.println("Index for key is : " + binarysearch(arr,key));

    }
}
