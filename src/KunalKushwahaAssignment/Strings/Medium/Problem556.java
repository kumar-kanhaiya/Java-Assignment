package KunalKushwahaAssignment.Strings.Medium;

import java.util.Arrays;

public class Problem556 {
    public static void main(String[] args) {
        int n = 12443322;
        String[] arr = StringForm(n);
        System.out.println(pivot(arr));


    }

    public static int nextGreaterElement(int n) {
        String[] array = StringForm(n);
        int pivot = pivot(array);
        if(pivot == -1){
            return -1;
        }
        int max = array.length - 1;
        for (int i = array.length - 1; i >= pivot ; i--) {
            if((Integer.parseInt(array[i]) > Integer.parseInt(array[max]))){
                max = i;
            }
        }
        swap(array,pivot,max);


    }
    public static String[] StringForm(int number){
        String check = number + "";
        String[] array = check.split("");
        return array;

    }

    public static int pivot(String[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            int current = Integer.parseInt(arr[i]);
            int next = Integer.parseInt(arr[i + 1]);
            if (current < next) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(String[] array , int first , int second){
        String temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
