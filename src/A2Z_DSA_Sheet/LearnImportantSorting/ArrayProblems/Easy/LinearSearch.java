package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class LinearSearch {
    static void main(String[] args) {
        // linear search is used to get the information of an element whether a element is present or absent in
        // the array it is applicable for both sorted and unsorted array

        int[] arr = {10,23,45,54,2,34,5};
        System.out.println(linearSearch(arr,45));


    }
    public static boolean linearSearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

}
