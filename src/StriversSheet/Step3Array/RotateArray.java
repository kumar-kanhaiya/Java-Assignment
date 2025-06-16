package StriversSheet.Step3Array;
// leetcode 189 - medium problem

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(ro(array)));
        rotate(array , 3);


    }
    public static void rotate(int[] nums, int k) {
        int[] newArray = nums;
        int i = 1;
        while(i<= k){
            newArray = ro(newArray);
            i++;
        }
        System.out.print(Arrays.toString(newArray) );


    }

    public static  int[] ro(int[] array ){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(i == 0){
                newArray[i] = array[array.length - i - 1];
            }
            else{
                newArray[i] = array[i-1];
            }
        }
        return newArray;
    }
}
