package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1502 {
    public static void main(String[] args) {
        int[] array = {1,2,4};
        System.out.println(canMakeArithmeticProgression(array));

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length < 2){
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i-1] != difference(arr)){
                return false;
            }
        }
        return true;

    }
    public static int difference(int[] arr){

        return arr[1]-arr[0];
    }
}
