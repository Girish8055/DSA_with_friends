package shhradha;

public class update_arr {

    public static void update( int marks[]){
        for(int i=0; i< marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[ ] = {92,95,98,97,94};

        update(marks);

        //for printing our marks
        for(int i=0; i< marks.length;i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
