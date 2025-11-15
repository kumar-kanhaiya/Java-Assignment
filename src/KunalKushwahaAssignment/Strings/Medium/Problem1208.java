package KunalKushwahaAssignment.Strings.Medium;

public class Problem1208 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        System.out.println(equalSubstring(s,t,3));

    }

    public static int equalSubstring(String s, String t, int maxCost) {

        int i = 0;
        int[] arr = new int[s.length()];
        while(i< s.length()){
            arr[i] = Math.abs((int)s.charAt(i) - (int) t.charAt(i));
            i++;
        }

        // now we get the array now implement sliding window or binary search for the answer ;
        int ans = 0;
        // arr = [15,8,6,12,4]
        for (int j = 0; j < arr.length ;j++ ) {
            int sum = 0;
            int k = j;
            while(k < arr.length){
                if(sum + arr[k] > maxCost){
                    break;
                }
                else{
                    sum += arr[k];
                    k++;

                }
            }
            ans = Math.max(k-j , ans);
        }
        return ans;
    }

    // 2nd approach
    public static int equalSubstring1(String s , String t , int maxCount){
        int cost = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        while(j< s.length()){
            cost += Math.abs((int)s.charAt(j) - (int)t.charAt(j));

            while(cost > maxCount){
                cost -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }

            ans = Math.max(ans , j-i + 1);
            j++;
        }
        return ans;
    }
}
