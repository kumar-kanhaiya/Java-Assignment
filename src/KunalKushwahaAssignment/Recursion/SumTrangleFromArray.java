package KunalKushwahaAssignment.Recursion;

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
}
