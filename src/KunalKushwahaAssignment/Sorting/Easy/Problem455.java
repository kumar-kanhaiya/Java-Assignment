package KunalKushwahaAssignment.Sorting.Easy;

import java.util.Arrays;

public class Problem455 {
    public static void main(String[] args) {
        int[] s ={1,2,3};
        int[] g ={1,2};
        System.out.println(findContentChildren(g,s));


    }

    public static int findContentChildren(int[] g, int[] s) {
        sort(g);
        sort(s);
        int ans = 0;
        int index = 0;
        for (int i = 0; i < g.length; i++) {
            while (index < s.length) {
                if (g[i] <= s[index]) {
                    ans++;
                    index++;
                    break;
                }
                index++;
            }
        }

        return ans;
    }


    public static void sort(int[] array){
        int end = array.length - 1;
        while(end >0){
            int max = maxIndex(array , end);
            int temp = array[max];
            array[max] = array[end];
            array[end] = temp;
            end--;
        }
    }

    public static int maxIndex(int[] array , int end){
        int max = 0;
        for (int i = 0; i <= end ; i++) {
            if(array[i] > array[max]){
                max= i;
            }
        }
        return max;
    }
}
