package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.HashMap;

public class SubarrayWithXorK {
    static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        System.out.println(maxSubArrayWithXorK(arr , 5));

    }

    // first approach
    public static int maxSubArrayWithXorK(int[] arr , int k){
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            int check = arr[i];
            // check the case if the number is also equal to k
            if(check == k){
                ans++;
            }
            for (int j = i+1; j <arr.length ; j++) {
                check = check^arr[j];
                if(check == k){
                    ans++;
                }
            }
        }
        return ans;
    }

    // second approach -> optimal approach
    public static int maxSubArray(int[] arr , int k ){
        HashMap<Integer, Integer> map = new HashMap<>();
        int prevXor = 0;
        int count = 0;
        for(int num : arr){
            prevXor ^= num;
            int target = prevXor - k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prevXor , map.getOrDefault(prevXor,0) + 1);
        }
        return  count;
    }

}
