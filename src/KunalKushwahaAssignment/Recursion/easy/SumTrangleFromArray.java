package KunalKushwahaAssignment.Recursion.easy;

import java.util.Arrays;

public class SumTrangleFromArray {
    static void main() {
        int[] array = {1,2,3,4,5};
        sumOfTriangleFromArray(array);

    }

    public static void sumOfTriangleFromArray(int[] array){

        // Base condition
        if(array.length < 1){
            return;
        }

        int[] temp = new int[array.length - 1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = array[i] + array[i+1];
        }

        sumOfTriangleFromArray(temp);

        System.out.println(Arrays.toString(array));

    }

    // 2nd approach
    public static void sumOfTriangleFromArray2(int[] array){

        // Base condition
        if(array.length < 1){
            return;
        }

        int[] temp = new int[array.length-1];
        helper(temp , array , 0);

        sumOfTriangleFromArray2(temp);

        System.out.println(Arrays.toString(temp));

    }

    public static int[] helper(int[] temp , int[] array , int index){
        // Base Condition
        if(index ==  array.length - 1){
            return temp;
        }
        temp[index] = array[index] + array[index+1];
        return helper(temp , array , index+1);
    }
}
