package KunalKushwahaAssignment.Strings.Easy;

public class Problem709 {
    public static void main(String[] args) {
        String name = "Kanhaiya";
        System.out.println(toLowerCase2(name));

    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    // 2 nd approach

    public static String toLowerCase2(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <=90){
                ans += (char)(s.charAt(i) + 32);
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
