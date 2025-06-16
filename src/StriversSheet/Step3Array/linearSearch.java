package StriversSheet.Step3Array;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr= {5,4,8,9,6,3};
        System.out.println();

    }
    public static int index(int[] array , int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
