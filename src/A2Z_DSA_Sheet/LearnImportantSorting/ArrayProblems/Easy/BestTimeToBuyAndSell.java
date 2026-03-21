package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class BestTimeToBuyAndSell {
    static void main() {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }

    // first approach
    public static int maxProfit1(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length ; j++) {
                int profit = prices[j] - prices[i];
                ans = Math.max(profit , ans);
            }
        }
        return ans;
    }

    // optimal approach
    public static int maxProfit(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int nums: arr){
            // if current price is less than min price , update the min price
            if(nums < minPrice){
                minPrice = nums;
            }
            else{
                maxProfit = Math.max(maxProfit , nums - minPrice);
            }
        }
        return maxProfit;
    }

    // 3rd approach
    public static int maxProfit3(int[] arr){
        int mini = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length ; i++) {
            int cost = arr[i] - mini;
            maxProfit = Math.max(maxProfit , cost);
            mini = Math.min(mini , arr[i]);
        }
        return maxProfit;
    }
}
