package KunalKushwahaAssignment.Recursion;

import java.util.ArrayList;

public class MinAndMaxInArray {
    static void main() {
        int[] arr = {1,4,3,5,8,9};
        System.out.println(getMinMax(arr));

    }

    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        return helper(arr , arr.length-1);

    }

    public static ArrayList<Integer> helper(int[] arr , int index){
        // Base condition
        if(index == 0){
            ArrayList<Integer> demo = new ArrayList<>();
            demo.add(arr[0]);
            demo.add(arr[0]);
            return  demo;
        }

        ArrayList<Integer> result = helper(arr , index -1);
        if(arr[index] < result.get(0)){
            result.set(0,arr[index]);
        }
        if(arr[index] > result.get(1)){
            result.set(1,arr[index]);
        }

        return result;
    }
}
