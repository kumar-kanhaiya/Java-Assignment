package KunalKushwahaAssignment.Strings.Medium;

public class Problem1208 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdef";
        System.out.println(equalSubstring(s,t,3));

    }

    public static int equalSubstring(String s, String t, int maxCost) {

        int i = 0;
        String check = "";
        while(i< s.length()){
            if((int)t.charAt(i) - (int)s.charAt(i) <= maxCost){
                maxCost -= ((int)t.charAt(i) - (int)s.charAt(i));
                check += s.charAt(i);
                i++;
            }
            else{
                break;
            }
        }
        return check.length();
    }
}
