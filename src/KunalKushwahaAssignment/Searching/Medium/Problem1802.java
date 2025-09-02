package KunalKushwahaAssignment.Searching.Medium;

public class Problem1802 {
    public static void main(String[] args) {
        System.out.println(maxValue(8,7,14));

    }

    public static int maxValue(int n, int index, int maxSum) {

        int low= 0;
        int high = maxSum ;
        int ans = 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canPlace(mid , n , index , maxSum)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }

        }

        return ans;
    }

    public static boolean canPlace(int mid, int n, int index, int maxSum) {
        long sum = mid;


        int leftLen = index;
        if (leftLen < mid) {

            long high = mid - 1;
            long low = mid - leftLen;
            sum += (high + low) * leftLen / 2;
        } else {

            long high = mid - 1;
            long low = 1;
            sum += (high + low) * (mid - 1) / 2;
            sum += (leftLen - (mid - 1)) * 1;
        }


        int rightLen = n - index - 1;
        if (rightLen < mid) {
            long high = mid - 1;
            long low = mid - rightLen;
            sum += (high + low) * rightLen / 2;
        } else {
            long high = mid - 1;
            long low = 1;
            sum += (high + low) * (mid - 1) / 2;
            sum += (rightLen - (mid - 1)) * 1;
        }

        return sum <= maxSum;
    }

}
