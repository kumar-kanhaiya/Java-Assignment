package A2Z_DSA_Sheet.LearnImportantSorting.SortingI;

public class InsertionSort {
    static void main() {

    }
    public static void insertionSo(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
                j--;
            }
        }
    }
}
