package shhradha;

public class selection_sort {
    public static void selectionsort (int arr[]) {
        for (int i=0; i<arr.length; i++) {
            int minposition = i;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[minposition] > arr[j]) {
                    minposition = j;
                }
            }
            //swap
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printarr (int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        selectionsort(arr);
        printarr(arr);

    }
}
