package KunalKushwahaAssignment.Strings.Medium;

public class Problem1759 {
    public static void main(String[] args) {
        String s = "zzzzz";
        System.out.println(countHomogenous(s));

    }

    public static int countHomogenous(String s) {
        int ans = 0;
        // if all the element is same then we use n * (n+1)/2 formula
        for (int i = 0; i < s.length() ; i++) {
            String check = s.charAt(i)+"";
            for(int j = i+1 ; j< s.length() ; j++){
                if(s.charAt(i) != s.charAt(j)){
                    break;
                }
                check += s.charAt(j);
            }
            ans += check.length();
        }

        return ans;
    }
}
