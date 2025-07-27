package KunalKushwahaAssignment.Array.Easy;

import java.util.Arrays;

public class leetcode1672 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(array));

    }
    public static int maximumWealth(int[][] accounts) {
    int sum = 0 ;
        for (int i = 0; i < accounts.length; i++) {
            int check = 0;
            for (int j = 0; j <accounts[i].length ; j++) {
                check += accounts[i][j];
            }
            if(check>sum){
                sum = check;
            }
        }
    return sum;
    }
}
