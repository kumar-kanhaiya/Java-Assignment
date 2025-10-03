package KunalKushwahaAssignment.Strings.Medium;

public class Problem1616 {
    public static void main(String[] args) {
        String str = "ulaalu";
        System.out.println(isPalindrome(str));

    }

    public static boolean checkPalindromeFormation(String a, String b) {
        if(a.length() == 1 && b.length() == 1){
            return true;
        }
        String aSuffix = "";
        String bSuffix = "";
        String aPrefix = "";
        String bPrefix = "";

        int index = Math.max(findIndex(a,b,true) , findIndex(a,b,false));

        for (int i = 0; i < index; i++) {
            aPrefix += a.charAt(i);
            bPrefix += b.charAt(i);
        }
        for (int i = index; i <a.length() ; i++) {
            aSuffix += a.charAt(i);
            bSuffix += b.charAt(i);
        }

        return (isPalindrome(aPrefix+bSuffix) || isPalindrome(bPrefix + aSuffix));

    }

    public static boolean isPalindrome(String str){
        String rev = "";
        for (int i = 0; i < str.length() ;i++) {
            rev = str.charAt(i) + rev;
        }
        return rev.equals(str);
    }

    public static int findIndex(String a , String b , boolean check ){
        if(check){
            for (int i = 0; i < a.length() ; i++) {
                if(a.charAt(i) == b.charAt(b.length() - i -1)){
                    continue;
                }
                else{
                    return i;
                }
            }
        }
        else{
            for (int i = 0; i < b.length(); i++) {
                if(b.charAt(i) == a.charAt(a.length() - i - 1)){
                    continue;
                }
                else{
                    return i;
                }
            }
        }
        return -1;
    }
}
