package KunalKushwahaAssignment.Searching.Easy;

public class Problem278 {
    public static void main(String[] args) {

    }
    public static boolean isBadVersion(int version){
        return true;
    }
    public static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false){
                // ans find
                return mid;
            }
            else if(isBadVersion(mid) == true){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
