package Array;

import java.util.Arrays;

public class Leetcode832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0} , {1,0,1} , {0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int row = 0; row < ans.length ; row++) {
            for (int collumn = 0; collumn < ans.length ; collumn++) {
                System.out.print(ans[row][collumn]);
            }
            System.out.println();
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] newArray = new int[image.length][image.length];
        for (int row = 0; row < image.length ; row++) {
            for (int collumns = 0; collumns < image.length; collumns++) {
                newArray[row][image.length - collumns - 1] = image[row][collumns];
            }
        }
        // loop for converting normal 2d array into image of this 2d array
        for (int i = 0; i < newArray.length ; i++) {
            for (int j = 0; j < newArray.length ; j++) {
                if(newArray[i][j] == 0){
                    newArray[i][j] = 1;
                }
                else{
                    newArray[i][j] = 0;
                }
            }
        }
        return newArray;
    }
}
