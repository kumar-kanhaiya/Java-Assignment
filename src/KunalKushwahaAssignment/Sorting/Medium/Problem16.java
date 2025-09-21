package KunalKushwahaAssignment.Sorting.Medium;

import java.util.Arrays;

public class Problem16 {
    public static void main(String[] args) {
        int[] array = {-1,2,1,-4};
        System.out.println(threeSumClosest(array , 1));

    }

    public static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        int ans = 0;
        for (int i = 0; i < array.length ; i++) {
            int j = i+1;
            int k = array.length-1;
            while(j< k){
                int check = array[i] + array[j] + array[k];
                if(check <= target){
                    ans = Math.min(ans,check);
                    j++;
                    k--;
                }
                else {
                    ans  = Math.max(ans,check);
                    j++;
                }


            }
        }
        return ans;
    }
}
