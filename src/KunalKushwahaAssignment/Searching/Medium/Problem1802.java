package KunalKushwahaAssignment.Searching.Medium;

public class Problem1802 {
    public static void main(String[] args) {
        System.out.println(maxValue(6,1,10));

    }

    public static int maxValue(int n, int index, int maxSum) {

        int low= 0;
        int high = maxSum ;
        int ans = 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(canPlace(mid , n , index , maxSum)){
                ans = mid;
                low = mid+ 1;
            }
            else{
                high = mid -1;
            }

        }

        return ans;
    }

    public static  boolean canPlace(int mid , int n , int index , int maxSum){
        int sum = 0 ;
        sum += mid;
        // left case
        int l = 1;
        for (int i = 0; i < index ; i++) {
            sum += l;
            l++;
        }
        int r = 1;
        for (int i = n ; i > index + 1; i--) {
            sum += r;
            r++;
        }

        return sum <= maxSum;
    }

}
