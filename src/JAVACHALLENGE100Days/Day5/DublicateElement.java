package JAVACHALLENGE100Days.Day5;

public class DublicateElement {
    public static void main(String[] args) {
        int[] array = {4,3,6,8,3,4,7};
        for (int i = 0; i < array.length ; i++) {
            int copy = array[i];
            for (int j = i + 1 ; j < array.length ; j++) {
                if(copy == array[j]){
                    System.out.print(array[j] + " ");
                }

            }

        }
    }
}
