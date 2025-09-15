package KunalKushwahaAssignment.Sorting.Easy;

import java.util.HashSet;

public class Problem414 {
    public static void main(String[] args) {
        int[] array = {3,2,1};
        System.out.println(thirdMax(array));

    }
    public static int thirdMax(int[] nums) {
        sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int[] ans = new int[set.size()];
        int i = 0;
        for(int e: set){
            if(i >= set.size()){
                break;
            }
            ans[i] = e;
            i++;
        }
        if(ans.length < 3){
            return ans[ans.length-1];
        }
        else{
            return ans[ans.length - 3];
        }

    }

//    public static int thirdMax2(int[] array){
//
//    }
//    public static int removeDuplicate(int[] array){
//
//    }

    public static void sort(int[] array ){
        int end = array.length - 1;
        while(end>0){
            int max = maxIndex(array , end);
            int temp = array[max];
            array[max] = array[end];
            array[end] = temp;
            end--;
        }
    }
    public static int maxIndex(int[] array ,int end ){
        int max = 0;
        for (int i = 0; i <= end ; i++) {
            if(array[i] > array[max]){
                max = i;
            }
        }
        return max;
    }
        

}
