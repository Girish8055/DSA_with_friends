package shhradha;

public class rec_first_occurence {

    public static int firstoccur (int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,8,9,6,3,1,4,7,5};
        System.out.println(firstoccur(arr,8,0));

    }
}
