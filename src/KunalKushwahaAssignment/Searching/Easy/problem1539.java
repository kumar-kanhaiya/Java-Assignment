package KunalKushwahaAssignment.Searching.Easy;

public class problem1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));

    }
    public static int findKthPositive(int[] arr, int k) {
        // first we do with root force approach
        int start = 1;
        int i = 0;
        while(k>0){
            if(i< arr.length && start == arr[i]){
                start++;
                i++;
            }
            else{
                start++;
                k--;
            }
        }
        return start - 1;
    }
}
