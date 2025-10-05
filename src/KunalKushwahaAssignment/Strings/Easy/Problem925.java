package KunalKushwahaAssignment.Strings.Easy;

public class Problem925 {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";

    }

    // problem is done by using two pointer approach
    public static boolean isLongPressedName(String name, String typed) {
        int index1 = 0;
        int index2 = 0;

        while(index1 < name.length()){
            if(name.charAt(index1) == typed.charAt(index2)){
                index2++;
                index1++;
            }
            else if(index1 >0 && name.charAt(index1-1) == typed.charAt(index2) ){
                index2++;
            }
            else{
                return false;
            }
        }
        return true;
    }

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
