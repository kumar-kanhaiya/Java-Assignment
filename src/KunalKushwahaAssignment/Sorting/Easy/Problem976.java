package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem976 {
    public static void main(String[] args) {
        int[] array = {1,2,1,10};
        System.out.println(largestPerimeter(array));

    }

    public static int largestPerimeter(int[] array) {
        insertionSort(array);
        // select three element ;
        // base case check
        int ans = 0;
        if(array.length<3){
            return 0;
        }
        for (int i = 0; i < array.length; i++) {

            int j = i;
            while (j < array.length && j + 2 < array.length) {
                int first = array[i];
                int second = array[j+1];
                int third = array[j+2];
                boolean check = helper(first, second, third);
                if (check) {
                    // finding the area ;
                    ans = Math.max((first+second+third),ans);
                }
                j++;
            }
        }
        return ans;

    }
    public static boolean helper(int a , int b , int c ){
        return (a+b >c && b+c> a && a+c>b);
    }
    // sort the array
    public static void insertionSort(int[] array ){
        for (int i = 0; i <= array.length - 1 ; i++) {
            int j = i;
            while(j>0 && array[j-1]>array[j]){
                swap(array,j-1,j);
                j--;
            }

        }
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] =temp;
    }

//    public static int max(int a , int b , int c){
//        if(a>b && a>c){
//            return a;
//        }
//        else if(b>a && b>c){
//            return b;
//        }
//        else{
//            return c;
//        }
//    }

    // second approach
    public int largestPerimeter2(int[] array) {
        Arrays.sort(array);


        for (int i = array.length - 1; i >= 2; i--) {

            if (array[i - 2] + array[i - 1] > array[i]) {

                return array[i] + array[i - 1] + array[i - 2];
            }
        }


        return 0;
    }
}
