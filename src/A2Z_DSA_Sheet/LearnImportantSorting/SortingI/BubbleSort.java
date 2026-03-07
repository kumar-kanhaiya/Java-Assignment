package A2Z_DSA_Sheet.LearnImportantSorting.SortingI;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {13,24,20,9,46,52};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <= arr.length - i -1; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // optimise approch
    public static void optimiseBubbleSort(int[] arr){
        for (int i = arr.length -1; i >=0 ; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap ==0){
                break;
            }
        }
    }
}
