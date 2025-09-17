package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1051 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(heightChecker(array));
    }
    public static int heightChecker(int[] heights) {
        int[] check = new int[heights.length];
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            check[i] = heights[i];
        }
        Arrays.sort(check);
        for (int i = 0; i < check.length; i++) {
            if(heights[i] != check[i]){
                ans++;
            }
        }
        return ans;
    }
}
