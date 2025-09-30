package KunalKushwahaAssignment.Strings.Easy;

public class Problem14 {
    public static void main(String[] args) {
        String[] check = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(check));

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strs[0].length() ; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length ; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != ch ){
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}
