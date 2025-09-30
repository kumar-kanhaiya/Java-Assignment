package KunalKushwahaAssignment.Strings.Easy;

public class Problem925 {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";

    }

//    public static boolean isLongPressedName(String name, String typed) {
//        for (int i = 0; i < name.length() ; i++) {
//            if(occurence(typed,typed.charAt(i)) >= occurence(name,name.charAt(i))){
//
//            }
//        }
//
//    }

    public static int occurence(String name , char target){
        int ans = 0;
        for (int i = 0; i < name.length() ; i++) {
            if(name.charAt(i) == target){
                ans++;
            }
        }
        return ans;
    }


}
