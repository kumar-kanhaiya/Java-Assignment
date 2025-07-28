package KunalKushwahaAssignment.Array.Easy;

public class leetcode1295 {
    public static void main(String[] args) {
        int[] array = {12,345,2,6,7896};
        System.out.println(findNumbers(array));

    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            boolean check = isEven(nums[i]);
            if(check ==true){
                count++;
            }
        }

        return count;
    }
    public static boolean isEven(int number){
        int count = 0;
        while(number > 0){
            int rem = number/10;
            count++;
            number/=10;

        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
