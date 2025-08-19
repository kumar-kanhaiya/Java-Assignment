package KunalKushwahaAssignment.Searching.Medium;

public class problem540 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(array));

    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = nums.length -1 ;
        while(s <= e){
            int mid = s + (e-s)/2;
            int check = nums[mid] - nums[mid+1];
            if(check == 0){
                s = mid +1;
            }
        }
    }
}
