package KunalKushwahaAssignment.Recursion;

public class FirstUpperCaseLetterInString {
    static void main() {
        System.out.println(first("kanhaiya"));

    }

    static char first(String str){
        return helper(str,0);
    }

    public static char helper(String s , int index){
        if(s.charAt(index) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(s.charAt(index))){
            return s.charAt(index);
        }
        try {
            return helper(s, index + 1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

}
