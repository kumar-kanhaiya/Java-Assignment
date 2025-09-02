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
    // 2nd approach
    public static int maxValue2(int n, int index, int maxSum){
//        long sum = 0;
        long r = n - index - 1;
        long l = index;
        long end = maxSum;
        long start = 1;
        long res = 0;

        while(start <= end){
            long mid = start + (end - start)/2;
            long sum = mid;
            long ls = 0; // sum on left side
            long rs = 0; // sum on right side
            long m = mid - 1;

            if(r <= m){
                rs = m*(m+1)/2 - (m - r)*(m -r + 1 )/2;
            }
            else{
                // extra filling 1
                rs = m*(m+1)/2 - 1*(r-m);

            }

            if(l <= m){
                ls = m*(m+1)/2 - (m - l)*(m -l + 1 )/2;

            }
            else{
                ls = m*(m+1)/2 - 1*(l-m);

            }

            sum += ls + rs;

            if(sum<= maxSum){
                res = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)res;
    }
}
