package KunalKushwahaAssignment.Sorting.Medium;

import java.util.Arrays;

public class Problem16 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        System.out.println(threeSumClosest(array , 1));

    }

    public static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        int closest = array[0] + array[1] + array[2];
        for (int i = 0; i < array.length ; i++) {
            int j = i+1;
            int k = array.length-1;
            while(j < k){
                int check = array[i] + array[j] + array[k];

                closest = close(closest, check, target);

                if(check == target){
                    return check;
                }
                else if(check < target){
//                    closest = Math.max(closest,check);
                    j++;

                }
                else {
//                    closest  = Math.min(closest,check);
                    k--;


                }


            }
        }
        return closest;

    }
//
    public static int close(int left , int right , int target){
        if( Math.abs(left - target) < Math.abs(right - target)){
            return left;
        }
        return right;
    }
}
