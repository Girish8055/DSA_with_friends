package shhradha;

import java.util.ArrayList;

public class Heaps_insert_in_heaps {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last idx
            arr.add(data);

            int x = arr.size()-1;   // x is child index
            int par = (x-1)/2;      // par index

            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

//        public int peek() {
//            return arr.get(index:0);
//        }
    }
    public static void main(String[] args) {

    }
}
