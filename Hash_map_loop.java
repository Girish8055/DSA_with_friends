package shhradha;

import java.util.HashMap;
import java.util.Set;

public class Hash_map_loop {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India",150);
        hm.put("US",40);
        hm.put("Nepal",15);
        hm.put("bhutan",50);
        hm.put("china",10);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys) {
            System.out.println("key = "+ k + ", value = "+hm.get(k));
        }

    }
}
