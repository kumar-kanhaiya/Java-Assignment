package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.Arrays;

public class UnionOfTwoSortedArray {
    static void main(String[] args) {
        int[] arr1 ={2,4,6,8,10,12};
        int[] arr2 = {1,3,5,7,9,11,13,15,18,20};
        int[] result = unionOfTwoArray(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }
    public static int[] unionOfTwoArray(int[] arr1 , int[] arr2){
        int[] ans = new int[arr1.length+ arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                ans[index++] = arr1[i++];
            }
            else{
                ans[index++] = arr2[j++];
            }
        }

        // now check one array is not empty
        while(i< arr1.length){
            ans[index++] = arr1[i++];
        }
        // now check the second one
        while(j< arr2.length){
            ans[index++] = arr2[j++];
        }
        return ans;
    }
}
