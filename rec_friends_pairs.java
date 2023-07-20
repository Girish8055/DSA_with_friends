package shhradha;

public class rec_friends_pairs {

    public static int friendspairing (int n) {

        if (n==1 || n==2) {
            return n;
        }
//        //choice
//        //single
//        int a = friendspairing(n-1);
//
//        //pair
//        int b = friendspairing(n-2);
//        int pairways = (n-1) * b;
//
//        //toway
//        int toways = a+pairways;
//        return toways;


        //we can write program also like this
        return friendspairing(n-1) + (n-1) * friendspairing(n-2);

    }
    public static void main(String[] args) {
        System.out.println(friendspairing(5));
    }
}
