package KunalKushwahaAssignment.Strings.Medium;

public class Problem1616 {
    public static void main(String[] args) {
        String str = "ulaalu";
        System.out.println(isPalindrome(str));

    }

    public static boolean checkPalindromeFormation(String a, String b) {
        String aSuffix = "";
        String bSuffix = "";
        String apreffix = "";
        String bpreffix = "";


    }

    public static boolean isPalindrome(String str){
        String rev = "";
        for (int i = 0; i < str.length() ;i++) {
            rev = str.charAt(i) + rev;
        }
        return rev.equals(str);
    }

    public static int findIndex(String a , String b ){
        int i = 0;
        int j = b.length()-1;
        while(i<a.length()){
            char ch = a.charAt(i);
            while(j>=0){
                if(b.charAt(j) == ch){
                    i++;
                    j--;
                }
                else{
                    return i;
                    break;
                }
            }
            i++;
        }
    }
}
