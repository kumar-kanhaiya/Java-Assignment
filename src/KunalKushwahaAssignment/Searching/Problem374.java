package KunalKushwahaAssignment.Searching;

public class Problem374 {
    public static void main(String[] args) {

    }
    public static int guess(int number ){
        return number;
    }

    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
    // we use binary search for this
    /*
    steps
    1. start point is 0 and end point is n
    2. declaring mid then take conditions when the ans == mid then return mid
     */

    // done with 100% beats
    public static int guessNumber(int n) {
        int start = 0;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(guess(mid) == 0){
                return mid;
            }
            else if (guess(mid) == 1){
                start = mid +1 ;
            }
            else{
                end = mid -1;
            }
        }
        return end;
    }
}
