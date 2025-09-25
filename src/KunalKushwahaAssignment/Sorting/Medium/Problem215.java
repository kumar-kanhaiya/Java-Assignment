package KunalKushwahaAssignment.Sorting.Medium;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem215 {
    public static void main(String[] args) {
        int[] array = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(array,4));

    }

    // this problem is done without using sorting algo
    public static int findKthLargest(int[] nums, int k) {
        // remove duplicate element
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int element : set){
            list.add(element);
        }
        while(k != 1){
            int max = maxIndex(list);
            list.remove(max);
            k--;

        }
        int max = maxIndex(list);
        return list.get(max);

    }
    public static int maxIndex(ArrayList<Integer> list ){
        int max = 0;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) > list.get(max)){
                max = i;
            }
        }
        return max;
    }
}
