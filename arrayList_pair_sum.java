package shhradha;

import java.util.ArrayList;

public class arrayList_pair_sum {

//    // 1 point approch
//    public static boolean pairsum(ArrayList<Integer> list, int target) {
//        for(int i=0; i<list.size(); i++) {
//            for(int j=i+1; j<list.size(); j++) {
//                if (list.get(i) + list.get(j) == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }



    // 2 point approach

    public static boolean pairsum1 (ArrayList<Integer> list, int target) {
        int left_point= 0;
        int right_point = list.size()-1;

        while(left_point != right_point) {

            // case1
            if(list.get(left_point) + list.get(right_point) == target) {
                return true;
            }

            //case 2
            if (list.get(left_point) + list.get(right_point) < target) {
                left_point ++;
            }

            // case 3
            else {
                right_point -- ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(5);

        int target = 15;
       // System.out.println(pairsum(list,target));
        System.out.println(pairsum1(list,target));
    }
}
