package KunalKushwahaAssignment.Searching;

public class Problem367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));

    }
    // this problem is done by using binary search
    public static boolean isPerfectSquare(int num) {
        if(num <= 0){
            return false;
        }
        int start = 1;
        int end = num;

        while(start <= end){
            int mid = start + (end -start)/2;
            if(mid*mid == num){
                // we find our ans
                return true;
            }
            else if (mid > num/mid){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
