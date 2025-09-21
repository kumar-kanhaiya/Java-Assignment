package KunalKushwahaAssignment.Sorting.Medium;

import java.util.Arrays;

public class Problem16 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        System.out.println(threeSumClosest(array , 1));

    }

    public static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        int left = 0;
        int right = sum(array) ;
        for (int i = 0; i < array.length ; i++) {
            int j = i+1;
            int k = array.length-1;
            while(j< k){
                int check = array[i] + array[j] + array[k];
                if(check <= target){
                    left = Math.max(left,check);
                    j++;
                    k--;
                }
                else {
                    right  = Math.min(right,check);
                    j++;
                }


            }
        }
        return close(left, right, target);

    }
    public static int sum(int[] array){
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }
    public static int close(int left , int right , int target){
        if(left > 0  && right > 0 && Math.abs(left - target) < Math.abs(right - target)){
            return left;
        }
        return right;
    }
}
