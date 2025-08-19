package KunalKushwahaAssignment.Searching.Medium;

public class problem540 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(array));

    }
    public static int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int s = 0;
        int e = nums.length -1 ;
        while(s < e){
            int mid = s + (e-s)/2;
            if(mid%2 == 0){
                if(nums[mid] == nums[mid + 1]){
                    s = mid +1;
                }
                else{
                    e = mid - 1;
                }
            }
            else if(mid%2 !=0){
                if(nums[mid] == nums[mid -1 ] ){
                    s = mid + 1;
                }
                else{
                    e = mid -1;
                }
            }
            else{
                return nums[mid];
            }
        }
        return -1;
    }
}
