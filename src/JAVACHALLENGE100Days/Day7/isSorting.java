package JAVACHALLENGE100Days.Day7;

public class isSorting {
    public static void main(String[] args) {
        int[] array = {1,2,3,12,5,6,7,8,9,10};
        System.out.println(isShort(array));

    }
    public static boolean isShort(int[] array ){
        for (int i = 1; i < array.length ; i++) {
            if(array[i-1] > array[i] && i+1 < array.length ){
                return false;
            }
        }
        return true;
    }
}
