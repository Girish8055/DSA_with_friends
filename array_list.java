package shhradha;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(5);

        System.out.println(list);

        System.out.println(list.size());


//        //Get operation
//        int element = list.get(4);
//        System.out.println(element);


//        //Delete Element
//        list.remove(1);
//        System.out.println(list);
//
//
//        //Set Element
//        list.set(1,7);
//        System.out.println(list);


//        //contains
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));
    }
}
