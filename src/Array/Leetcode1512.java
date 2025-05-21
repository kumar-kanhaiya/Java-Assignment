package Array;

public class Leetcode1512 {
    // done with 88.04% beats
    public static void main(String[] args) {
        int[] array = {1,1,1,1};
        System.out.println(numIdenticalPairs(array));
    }
    public static int numIdenticalPairs(int[] array) {
        int count = 0 ;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(array[i]  == array[j]){
                    count++;
                }
            }
        }
        return count;
    }


}
