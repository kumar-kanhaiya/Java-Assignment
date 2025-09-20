package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Problem1636 {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,2,3};
        decreasing(array);
        System.out.println(Arrays.toString(array));

    }
    public static int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        // different frequency -> increasing order
        // same frequency -> decreasing order
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        int[] uniqueNumber = new int[set.size()];
        HashMap<Integer , Integer> map = new HashMap<>();

        int index =0;
        for(int num : set){
            uniqueNumber[index] = num;
            map.put(num,occurence(nums,num));
            index++;
        }
        sortUniqueNumbers(uniqueNumber,map);

        int k = 0;
        for (int num : uniqueNumber){
            int freq = map.get(num);
            for (int j = 0; j < freq; j++) {
                ans[k] = num;
                k++;
            }
        }

        return ans;
    }
    public static int occurence(int[] array , int target ){

        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void increasingSort(int[] array){
        for (int i = 0; i <= array.length -1; i++) {
            int j = i;
            while(j>0 && array[j-1] > array[j]){
                swap(array , j-1 , j);
                j--;
            }
        }
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void decreasing(int[] array ){
        for (int i = 0; i < array.length ; i++) {
            int j = i;
            while(j>0 && array[j-1]<array[j]){
                swap(array,j-1,j);
                j--;
            }
        }
    }
    public static void sortUniqueNumbers(int[] uniqueNumber, HashMap<Integer,Integer> map){
        for (int i = 0; i < uniqueNumber.length; i++) {
            int j = i;
            while (j > 0) {
                int prev = uniqueNumber[j-1];
                int curr = uniqueNumber[j];

                int freqPrev = map.get(prev);
                int freqCurr = map.get(curr);


                if (freqPrev > freqCurr) {
                    swap(uniqueNumber, j-1, j);
                }

                else if (freqPrev == freqCurr && prev < curr) {
                    swap(uniqueNumber, j-1, j);
                }
                j--;
            }
        }
    }

}
