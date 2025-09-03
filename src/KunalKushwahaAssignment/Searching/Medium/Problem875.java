package KunalKushwahaAssignment.Searching.Medium;

public class Problem875 {
    public static void main(String[] args) {
        int[] array = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(array,1000000000));

    }
    public static int minEatingSpeed(int[] piles, int h) {
//        int totalHour = 0;
        int start = 1;
        int end = maxElement(piles);

        // we do using binary search
        while (start <= end){
            int mid = start  + (end - start)/2 ;
            long totalHour = 0;
            for (int pile : piles) {
                totalHour += (pile + mid - 1L) / mid;
            }

            if(totalHour <= h){
                end = mid -1;
            }
            if(totalHour > h){
                start = mid +1;
            }
        }
        return start;
    }
    public static int maxElement(int[] array){
        int check = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > check){
                check = array[i];
            }
        }
        return check;
    }
}
