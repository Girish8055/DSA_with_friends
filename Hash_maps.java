package shhradha;

import java.util.HashMap;

public class Hash_maps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India",150);
        hm.put("US",40);
        hm.put("Nepal",15);
        hm.put("bhutan",50);
        hm.put("china",10);

        System.out.println(hm);

        // Get
       int GDP = hm.get("India");
        System.out.println(GDP);
        System.out.println(hm.get("Indonesia"));

        //containsKey
        System.out.println(hm.containsKey("India"));  //true
        System.out.println(hm.containsKey("indonesia"));  //false

        //Remove
        int remove = hm.remove("china");
        System.out.println(hm);
    }
}
