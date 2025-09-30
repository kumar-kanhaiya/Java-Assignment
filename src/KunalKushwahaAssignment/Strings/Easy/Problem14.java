package KunalKushwahaAssignment.Strings.Easy;

public class Problem14 {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int start = 0;
        int index = 0;
        while(start < strs.length){
            while(!strs[start].startsWith(strs[start].charAt(index) + "")){
                index++;
            }
            if(index == strs.length){
                ans.append(strs[start].charAt(index));
            }
        }
        return ans.toString();
        
    }
}
