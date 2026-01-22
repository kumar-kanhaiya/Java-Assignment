package KunalKushwahaAssignment.Strings.Medium;

public class Problem1545 {
    static void main() {
        System.out.println(helper(1,4,"0"));
        System.out.println(findKthBit(4,11));

    }

    public static char findKthBit(int n, int k) {
        String ans = helper(1,n,"0");
        System.out.println(ans);
        return ans.charAt(k-1);
    }

    public static String helper(int n , int end , String prev){
        if(n == end){
            return prev;
        }
        StringBuilder sb = new StringBuilder(prev);

        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, sb.charAt(i) == '0' ? '1' : '0');
        }
        sb.reverse();

        String ans = prev + "1" + sb.toString();
        return helper(n+1,end , ans);
    }
}
