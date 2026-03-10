package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class CheckIfArrayIsSortedAndRotated {
    static void main() {
        int[] array = {3,4,5,1,2};
        System.out.println(check(array));

    }

    public static boolean check(int[] nums) {
        int len = nums.length;
        int check = 0;
        for(int i = 0 ; i< len; i++){

            // first condition check adjacent element
            if(i< len -1 && nums[i] > nums[i+1]){
                check++;
            }

            // now check the last element
            if(i == len -1 && nums[len -1 ] > nums[0] ){
                check++;
            }
        }
        if(check>1){
            return false;
        }
        return true;
    }
}
