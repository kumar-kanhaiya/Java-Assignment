package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem1491 {
    public static void main(String[] args) {
        int[] array = {1000,2000,3000};
        System.out.println(average(array));

    }
    public static   double average(int[] salary) {
        Arrays.sort(salary);
        if(salary.length <2){
            return 0;
        }
        double sum = 0;
        for (int i = 1; i < salary.length-1 ; i++) {
            sum += salary[i];
        }
        return (double)sum/(salary.length -2);
    }
}
