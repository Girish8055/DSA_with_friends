package shhradha;

public class rec_remove_duplicate {

    public static void removeduplicates(String str,int idx, StringBuilder newStr, boolean map[]) {
       if (idx == str.length()) {
           System.out.println(newStr);
           return;
       }

       //kaam
        char currchar = str.charAt(idx);
       if (map[currchar-'a'] == true) {
           //duplicate
           removeduplicates(str, idx+1, newStr, map);
       }
       else{
           map[currchar-'a'] = true;
           removeduplicates(str, idx+1, newStr.append(currchar), map);
       }
    }
    public static void main(String[] args) {
         String str = "GRIORSISHS";
         removeduplicates(str,0, new StringBuilder(""), new boolean[26]);
    }
}
