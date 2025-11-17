package KunalKushwahaAssignment.Others;

public class Problem1437 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,1};
        System.out.println(kLengthApart(nums,2));

    }

    public static boolean kLengthApart(int[] nums, int k) {

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == 1){
                for (int j = i+1; j < nums.length ; j++) {
                    if(nums[j] == 1){
                        if((j - i -1 ) < k ){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
