package StriversSheet.Step3Array;
// leetcode - 1752
public class isSorted {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(check(array));
    }
    public static boolean check(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[j-1] > array[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
