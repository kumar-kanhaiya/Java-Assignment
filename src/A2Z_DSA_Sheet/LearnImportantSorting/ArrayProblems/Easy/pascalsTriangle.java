package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pascalsTriangle {
    static void main(String[] args) {
        System.out.println(generate(5));

    }


    // first approach
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows ; i++) {
            // row with size i+1
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1 ,1 ));
            for (int j = 1; j <i ; j++) {
                row.set(j,ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            ans.add(row);
        }
        return ans;
    }

    // 2dn approach
    public static List<List<Integer>> generate2(int num){
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i <num ; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if(j == 0 || j== i){
                    row.add(1);
                }
                else{
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}
