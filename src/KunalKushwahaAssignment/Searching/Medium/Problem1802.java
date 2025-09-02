package KunalKushwahaAssignment.Searching.Medium;

public class Problem1802 {
    public static void main(String[] args) {
        System.out.println(maxValue(4,2,6));

    }

    public static int maxValue(int n, int index, int maxSum) {

        int sum = 0;
        int fill = 1 ;

        while(sum  <= maxSum){

            // terminating case
            if(sum == maxSum){
                return fill;
            }
            if(sum > maxSum){
                return fill- 1;
            }
            sum = 0;
            // middle the main case
            sum += fill;


            // for left case
            int l = 1;
            for (int i = 0; i < index; i++) {
                sum += l;
                l++;

            }

            // for right Case
            int r = 1;
            for (int i = index+ 1; i < n; i++) {
                sum += r;
                r++;

            }
            fill++;

        }
        return -1;


    }

}
