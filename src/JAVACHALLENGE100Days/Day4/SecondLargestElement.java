package JAVACHALLENGE100Days.Day4;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {12,5,8,19,7};
        int firstMax = maximumIndex(array);
        int secondMax = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == firstMax){
                firstMax = array[i];
            }
            else if(array[i] > secondMax){
                secondMax = array[i];
            }

        }
        System.out.println("second max " + secondMax);

    }
    public static int maximumIndex(int[] array ){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i] ;
            }
        }
        return max;
    }
}
