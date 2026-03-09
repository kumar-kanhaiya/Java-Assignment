package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(largestElement(arr));

    }

    public static int largestElement(int[] array){
        int ans = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i]> ans){
                ans = array[i];
            }
        }
        return ans;
    }
}
