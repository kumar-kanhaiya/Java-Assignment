package KunalKushwahaAssignment.Sorting.Easy;

public class Problem268 {
    public static void main(String[] args) {
        int[] array = {3,0,1};
        System.out.println(missingNumber(array));

    }

    public static int missingNumber(int[] nums){
        int n = nums.length;
        int requiredSum = (int)(n * (n+1)/2);
        int sum = 0;
        for(int element : nums){
            sum += element;
        }
        return requiredSum - sum;
    }
}
