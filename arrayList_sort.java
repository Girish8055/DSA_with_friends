package shhradha;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_sort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(5);

        System.out.println(list);

        Collections.sort(list); //Ascending order sort

        System.out.println("Ascending order sort : " + list);

        Collections.sort(list, Collections.reverseOrder()); //Descending order sort
        System.out.println("Descending order sort : " + list);

    }
}
