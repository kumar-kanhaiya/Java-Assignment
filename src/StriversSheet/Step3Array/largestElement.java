package StriversSheet.Step3Array;

public class largestElement {
    public static void main(String[] args) {
    int[] array = {3,3,6,1};

    }
    public static int largest(int[] array ){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
