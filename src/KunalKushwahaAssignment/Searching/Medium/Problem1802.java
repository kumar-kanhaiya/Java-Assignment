package KunalKushwahaAssignment.Searching.Medium;

public class Problem1802 {
    public static void main(String[] args) {
        System.out.println(maxValue(4,2,6));

    }

    public static int maxValue(int n, int index, int maxSum) {
        int[] ans = new int[n];
        int x = n;
        int sum = 0;
        while(sum <= maxSum){
            if(sum > maxSum) {
                ans[index] = x-1;
                x= x-1;
            }
            else {
                ans[index] = x;
            }
            sum =0;
            int check = x;

            for (int i = index; i < n ; i++) {
                sum += check--;
//                check = check--;
            }
            int lcheck = x;
            for(int i =0 ; i<index ; i++){
                sum += lcheck--;
//                lcheck--;
            }


        }
        return ans[index];

    }
    public static int sum(int[] array ){
        int s = 0;
        for(int element : array){
            s += element;
        }
        return s;

    }
}
