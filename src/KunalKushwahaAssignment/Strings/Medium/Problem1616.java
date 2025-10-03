package KunalKushwahaAssignment.Strings.Medium;

public class Problem1616 {
    public static void main(String[] args) {
        String a = "aejbaalflrmkswrydwdkdwdyrwskmrlfqizjezd";
        String b = "uvebspqckawkhbrtlqwblfwzfptanhiglaabjea";
        System.out.println(checkPalindromeFormation(a,b));

    }

    public static boolean checkPalindromeFormation(String a, String b) {
        if(a.length() == 1 && b.length() == 1){
            return true;
        }
        return check(a,b) || check(b,a);

    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    private static boolean check(String a, String b) {
        int l = 0, r = a.length() - 1;
        while (l < r && a.charAt(l) == b.charAt(r)) {
            l++;
            r--;
        }
        return isPalindrome(a, l, r) || isPalindrome(b, l, r);
    }
}
