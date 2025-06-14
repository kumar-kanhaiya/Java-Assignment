package StriversSheet.Step1LearnTheBasics.Recusion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array , array.length - 1 );

    }
    public static void reverse(int[] array , int n){
        if(n == 0){
            System.out.print(array[0]);
            return;
        }
        System.out.print(array[n] + " ");
        reverse(array , n-1);
    }
}
