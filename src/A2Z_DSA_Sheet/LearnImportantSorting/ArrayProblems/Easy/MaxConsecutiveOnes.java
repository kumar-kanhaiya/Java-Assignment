package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class MaxConsecutiveOnes {
    static void main() {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == 1){
                int count = 0;
                int j = i;
                while(j<nums.length && nums[j] == 1  ){
                    count++;
                    j++;
                }
                i = j;
                max = Math.max(max,count);
            }else{
                continue;
            }

        }
        return max;
    }
}
