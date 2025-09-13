package KunalKushwahaAssignment.Sorting.Easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Problem88 {
    public static void main(String[] args) {
        int[] first = {1,2,3,0,0,0};
        int[] second = {2,5,6};



    }
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        Queue<Integer> temp = new ArrayDeque<>();
        int first = 0;
        int second = 0;
        while(first < m && second<n){
            if(arr1[first] < arr2[second]){
                temp.add(arr1[first]);
                first++;
            }
            else{
                temp.add(arr2[second]);
                second++;
            }
        }
        while(first < m){
            temp.add(arr1[first]);
            first++;
        }
        while(second < n){
            temp.add(arr2[second]);
            second++;
        }
        // insert the element
        if(arr1.length == (m+n)) {
            for (int i = 0; i < (m + n); i++) {
                arr1[i] = temp.remove();
            }
        }
        else{
            for (int i = 0; i < (m + n); i++) {
                arr2[i] = temp.remove();
            }
        }

    }
}
