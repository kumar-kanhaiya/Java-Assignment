package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

public class SubArraySumEqualsK {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum2(arr,3));

    }

    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0;
        int ans = 0;
        int sum = arr[0];
        while(left<n && right<n){
            // first condition
            if(left<= right && sum>k){
                sum -= arr[left];
                left++;
            }

            // second case if the consecutive sum is equal to the k
            if(sum == k){
                ans++;
            }

            // expand the right window
            right++;
            if(right<n){
                sum+= arr[right];
            }
        }
        // last case
        if(arr[arr.length-1] == k){
            ans++;
        }
        return ans;
    }

    public static int subarraySum2(int[] arr , int k){
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = arr[i];
            for (int j = i+1; j < arr.length ; j++) {

                sum += arr[j];
                if(sum == k){
                    ans++;
                    break;
                }
                // case for breaking the loop
                if(sum > k){
                    break;
                }
                // case 2 for breaking the stuff

            }
            if(i == arr.length-1 && arr[i] == k){
                ans++;
            }
        }
        return  ans;
    }
}
