package KunalKushwahaAssignment.Recursion.easy;

public class lengthOfString {
    static void main() {
        System.out.println(recLen("Kanhaiya"));
    }

    static int recLen(String s){
        if(s == ""){
            return 0;
        }
        else{
            return recLen(s.substring(1)) +1;
        }
    }
}
