package StriversSheet.Step3Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {8,8,7,6,5};
        System.out.println(secondMax(array));
    }
    public static int secondMax(int[] array ){
        int max = max(array);
        int ans = -1;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == max){
                continue;
            }
            if(array[i] > ans){
                ans = array[i];
            }
        }
        return ans;
    }
    public static  int max(int[] array ){
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
