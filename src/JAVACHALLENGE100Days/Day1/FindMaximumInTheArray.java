package JAVACHALLENGE100Days.Day1;

public class FindMaximumInTheArray {
    public static void main(String[] args) {
        int[] array = {5,4,8,9,12,55};
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maximum in Array : " + max);
    }
}
