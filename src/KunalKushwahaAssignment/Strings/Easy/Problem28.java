package KunalKushwahaAssignment.Strings.Easy;



public class Problem28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        System.out.println(strStr(haystack,"code"));

    }

    // 1st approach
    public static int strStr(String haystack, String needle) {
        int ans = -1;
//        int j = 0;
        if(needle.length() == 0){
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                ans = i;
                for (int k = 0; k < needle.length(); k++) {
                    if(haystack.charAt(i+k) != needle.charAt(k)){
                        ans = -1;
                        break;
                    }
                    if(k == needle.length()-1 ){
                        return ans;
                    }
                }
            }
        }
        return -1;
    }

    // 2nd approach

    public static int strStr2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();


        if (m == 0) {
            return 0;
        }

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
