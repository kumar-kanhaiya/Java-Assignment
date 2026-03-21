package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

public class KadanesAlgorithm {
    static void main() {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(kadanesAlog(arr));

    }

    public static int kadanesAlog(int[] arr){
        long sum = 0;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];

            max = Math.max(max , sum);
            if(sum < 0){
                sum = 0;
            }
        }

        return (int) max;
    }
}
