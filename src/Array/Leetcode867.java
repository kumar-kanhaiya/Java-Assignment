package Array;

public class Leetcode867 {
    public static void main(String[] args) {
        int[] array = {1,3,6,2,1,0};
        System.out.println(peakIndex(array));

    }
    public static int peakIndex(int[] array ){
        // this question is done with the help of binary search
        int start = 0 ;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end- start) / 2;
            if(array[mid] > array[mid - 1 ] && array[mid] < array[mid+1]){
                // ans found
                return array[mid];
            }
            if (array[mid] > array[mid- 1 ] && array[mid] > array[mid + 1]){
                start = mid + 1;
            }

        }
        return -1 ;
    }
}
