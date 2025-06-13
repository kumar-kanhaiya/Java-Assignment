package JAVACHALLENGE100Days.Day7;

public class SumOfEachRow {
    public static void main(String[] args) {
      int[][] array = new int[3][3];
      // array input
        for (int i = 0; i < array.length ; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length ; j++) {
                sum += array[i][j];
                System.out.println(sum);
            }
        }

    }

}
