package KunalKushwahaAssignment.Array.Easy;

public class leetcode898 {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        System.out.println(subarrayBitwiseORs(array));

    }
    public static int subarrayBitwiseORs(int[] arr) {
        int ans =  0;
        if(arr.length == 1){
            return 1;
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i] != arr[j]){
                    ans++;
                }
                else{
                    continue;
                }
            }
        }
        return ans;
    }
}
