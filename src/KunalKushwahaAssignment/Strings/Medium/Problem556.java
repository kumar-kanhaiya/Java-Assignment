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
        int max =  - 1;
        for (int i = array.length - 1; i >pivot ; i--) {
            if((Integer.parseInt(array[i]) > Integer.parseInt(array[pivot]))){
                max = i;
                break;
            }
        }
        swap(array,pivot,max);

        reverse(array , pivot+1 , array.length -1);

        StringBuilder ans = new StringBuilder();
        for(String s : array){
            ans.append(s);
        }

        long finalans = Long.parseLong(ans.toString());
        return finalans>Integer.MAX_VALUE ? -1 : (int) finalans;

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

    public static void reverse(String[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

}
