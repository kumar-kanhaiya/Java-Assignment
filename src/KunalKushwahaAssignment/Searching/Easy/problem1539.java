package KunalKushwahaAssignment.Searching.Easy;

public class problem1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));

    }
    public static int findKthPositive(int[] arr, int k) {
        // first we do with root force approach
        int ans = arr[0];
        int start = 0;
        while(k!= 0){

            for(int i = arr[start] ; i< arr.length && i < arr[start + 1]  ; i++){
                ans++;

            }
            start++;
            k--;

        }
        return ans;
    }
}
