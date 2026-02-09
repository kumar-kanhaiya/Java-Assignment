package KunalKushwahaAssignment.Recursion;

public class BinarySearch {
    static void main() {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr,-19));

    }

    public static int binarySearch(int[] array, int target){
        return helper(array,0, array.length-1,target );
    }
    public static int helper(int[] arr , int start , int end , int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return helper(arr , mid+1,end,target);
        }
        else {
            return helper(arr, start, mid-1,target);
        }

    }
}
