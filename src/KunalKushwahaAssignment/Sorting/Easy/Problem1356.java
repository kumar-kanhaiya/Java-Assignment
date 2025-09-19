package KunalKushwahaAssignment.Sorting.Easy;

import java.util.*;

public class Problem1356 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.bitCount(7));
        int[] array = {1024,512,256,128,64,32,16,8,4,2,1};
        System.out.println(Arrays.toString(sortByBits(array)));
    }
    public static int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0 ;
        int index = 0;
        while(i<= maxBit(arr)){
            ArrayList<Integer> check = new ArrayList<>();
            for(int num : arr){
                if(Integer.bitCount(num) == i){
                    check.add(num);
                }
            }
            Collections.sort(check);
            // insert the element in ans array
            for(int val : check){
                ans[index++] = val;
            }
            i++;
        }
        return ans;

    }
    public static int maxBit(int[] array ){
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if(Integer.bitCount(array[i]) > ans){
                ans = Integer.bitCount(array[i]);
            }
        }
        return ans;
    }
}
