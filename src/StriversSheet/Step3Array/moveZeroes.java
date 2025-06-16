package StriversSheet.Step3Array;

import java.util.Arrays;

public class moveZeroes {
        public static void main(String[] args) {
            int[] array = {12,18,0,5,0,17,16,0,0};
        moveZero(array);
        System.out.println(Arrays.toString(array));
    }
    public static void moveZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if( array[array.length -1]==0){
                    break;
                }
                if(array[i] == 0 && array[j] != 0 ){
                    swap(array,i,j);

                }
                if(array[i] == 0 && array[j+1] != 0 && j < array.length-1){
                    swap(array,i,j+1);
                }
            }
        }
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
