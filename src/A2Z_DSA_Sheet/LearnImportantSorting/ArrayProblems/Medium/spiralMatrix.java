package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Medium;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int collStart = 0;
        int rowEnd = matrix.length-1;
        int collEnd = matrix[0].length-1;
        int pointer = 0;
        List<Integer> ans = new ArrayList<>();
        while(rowStart <= rowEnd && collStart <= collEnd){
            // case 1 done the coll section first
            pointer = collStart;
            while(pointer<= collEnd){
                ans.add(matrix[rowStart][pointer]);
                pointer++;
            }
            pointer= rowStart+1;
            while(pointer<= rowEnd){
                ans.add(matrix[pointer][collEnd]);
                pointer++;
            }
            pointer = collEnd-1;
            while(pointer>= collStart){
                if(rowStart == rowEnd){ // this is the main condition where pointer add the previous one
                    break;
                }
                ans.add(matrix[rowEnd][pointer]);
                pointer--;
            }
            // last case upside the things
            pointer = rowEnd-1;
//            System.out.println("pointer " + pointer);
            while (pointer >= rowStart+1){
                ans.add(matrix[pointer][collStart]);
//                System.out.println("value " + matrix[pointer][collStart]);
                pointer--;
            }
            collStart++;
            rowStart++;
            collEnd--;
            rowEnd--;
//            System.out.println("present coll" + collStart);

        }
        return ans;

    }
}
