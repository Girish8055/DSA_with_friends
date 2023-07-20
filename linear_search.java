package shhradha;

public class linear_search {

    public static int linearsearch (int[] number, int key){
        for (int i=0; i < number.length; i++){
            if (number[i] == key){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int number[] = {2,5,6,9,8,7,10,4};
        int key = 62;

        int index = linearsearch(number, key);
        if(index == 1){
            System.out.println("not found");
        }
        else {
            System.out.println("key found: " + index );
            System.out.println();
        }
    }
}
