package KunalKushwahaAssignment.Others;

public class Problem3354 {
    public static void main(String[] args) {
        int[] array = {2,3,4,0,4,1,0};
        System.out.println(leftSide(array,3));

    }

    public static int countValidSelections(int[] nums) {
        int ans = 0;

        //finding the zero index ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                ans += helper(nums,i);
            }
        }
        return ans;
    }

    public static int helper(int[] array , int index){

        if(rightSide(array,index)){
            return 1;
        }
        else if(leftSide(array,index)){
            return 1;
        }
        else if (leftSide(array,index) && rightSide(array,index)){
            return 2;
        }
        return 0;

    }

    public static boolean leftSide(int[] array , int index){
        int demo = index;
        while(true){
            int left = index-1 ;
            int right = index +1;
            while(array[left] == 0){
                left--;

            }
            while(array[right] == 0 && right < array.length){
                right++;
            }
            if(left >= 0){
                array[left]--;

            }
            if(right< array.length){
                array[right]--;

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

    public static boolean rightSide(int[] array , int index){



    }

}
