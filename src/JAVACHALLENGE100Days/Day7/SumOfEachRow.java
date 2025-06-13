package JAVACHALLENGE100Days.Day7;

import java.util.Scanner;

public class SumOfEachRow {
    public static void main(String[] args) {
      int[][] array = new int[3][3];
      // array input
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.printf("Enter %d , %d element : " , i+1 , j+1);
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < array.length ; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length ; j++) {
                sum += array[i][j];

            }
            System.out.println(sum);
        }

    }

}
