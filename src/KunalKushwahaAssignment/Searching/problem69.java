package KunalKushwahaAssignment.Searching;

public class problem69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
        System.out.println(Math.sqrt(2147395599));

    }
    // the solution is done by using binary search
    public static  int mySqrt1(int x) {
        int start = 0;
        int end = x;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < x/mid && (mid+1) > x/(mid+1) ){
                return mid;
            }
            else if(mid > x/mid){
                end = mid - 1;
            }
            else if(mid < x/mid){
                start = mid +1 ;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    // it give some problem second approach
    public static int mySqrt(int number){
        int start = 1;
        int end = number;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid == number/mid){
                return mid;
            }
            else if(mid > number/mid){
                end = mid - 1;
            }
            else{
                start = mid +1 ;
            }
        }
        return end;
    }
}
