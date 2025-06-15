package StriversSheet.Step3Array;
// leetcode - 1752
public class isSorted {
    public static void main(String[] args) {
        int[] array = {2,1,3,4};
        System.out.println(check(array));
    }
    public static boolean check(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[j-1] > array[j]){
                    if(array[j] > array[0] || array[array.length-1]> array[0]){
                        return false;
                    }
                    else if (j == array.length -1 ){
                        return true;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return true;
    }

}
