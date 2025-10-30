package KunalKushwahaAssignment.Others;

import java.util.Arrays;

public class Problem3354 {
    public static void main(String[] args) {
        int[] array = {1,0,2,0,3};
        System.out.println(countValidSelections(array));

    }

    public static int countValidSelections(int[] nums) {
        int ans = 0;

        //finding the zero index ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                ans += helper(Arrays.copyOf(nums,nums.length),i);
            }
        }
        return ans;
    }

    public static int helper(int[] array , int index){

        boolean left = leftSide(Arrays.copyOf(array, array.length), index);
        boolean right = rightSide(Arrays.copyOf(array, array.length), index);

        if (left && right) return 2;
        else if (left || right) return 1;
        return 0;


    }

    public static boolean leftSide(int[] array , int index){
        int demo = index;
        while(true){
            int left = index-1 ;
            int right = index +1;
            while (left >= 0 && array[left] == 0) {
                left--;
            }
            while(right < array.length && array[right] == 0 ){
                right++;
            }
            if(left >= 0 && array[left] > 1){
                array[left]--;

            }
            if(right< array.length && array[right] > 1){
                array[right]--;

            }


            /*if(array[left] < 0 || array[right] <0){
                return false;
            }*/
            if( (left == 0 && right == array.length-1)
                    || (array[left] == 0 && array[right] == 0) ){
                break;
            }

        }

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] != 0){
                return false;
            }
        }
        return true;

    }

    public static boolean rightSide(int[] array , int index){

        while(true){
            int right = index +1;
            int left = index -1 ;

            while(right < array.length && array[right] == 0 ){
                right++;
            }
            while (left >= 0 && array[left] == 0) {
                left--;
            }

            if(right< array.length && array[right] > 1) {
                array[right]--;

            }

            if(left >= 0 && array[left] > 1){
                array[left]--;

            }



            if(array[left] < 0 || array[right] <0){
                return false;
            }
            if( (left == 0 && right == array.length-1)
                    || (array[left] == 0 && array[right] == 0) ){
                break;
            }

        }

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] != 0){
                return false;
            }
        }
        return true;

    }

    //2nd approach
    public static int countValidSelections1(int[] nums){
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int leftSum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int rightSum = totalSum - leftSum;
                if (leftSum == rightSum ||
                        leftSum + 1 == rightSum) {
                    ans++;
                }
            }
            leftSum += nums[i];
        }
        return ans;
    }

}
