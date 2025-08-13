package KunalKushwahaAssignment.Searching.Easy;

public class Problem441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));

    }
    public static int arrangeCoins(int n) {
        if(n <= 0){
            return 0;
        }
        int start = 1;
        int end = n;
//        for (int i = 1; i <= n ; i++) {
//            end += i;
//        }
        while(start <= end){
            int mid = start + (end - start)/2;
            long coins = (long) mid * (mid + 1) / 2;
            if(n == coins){
                return mid;
            }
            else if( coins > n){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
