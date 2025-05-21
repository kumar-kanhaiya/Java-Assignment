package Array;

public class Leetcode1732 {
    // done with 100% beats
    public static void main(String[] args) {
        int[] array = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(array));
    }
    public static int largestAltitude(int[] gain) {
        int[] newArray = new int[gain.length + 1];
        newArray[0] = 0;
        for (int i = 0; i < gain.length ; i++) {
            newArray[i+1] = gain[i] + newArray[i];
        }
        int ans = 0 ;
        for(int element : newArray){
            if(element > ans){
                ans = element;
            }
        }
        return ans;
    }
}
