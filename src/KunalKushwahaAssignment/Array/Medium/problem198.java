package KunalKushwahaAssignment.Array.Medium;

public class problem198 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        System.out.println(rob(array));

    }
    public static int rob(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(j == i || (j == i+1 && (i+1 )< nums.length)){
                    continue;
                }
                else if (j == i-1 ){
                    continue;
                }
                else{
                    count++;
                }
            }
        }
        return count;
    }
}
