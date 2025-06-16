package StriversSheet.Step3Array;

import java.util.HashSet;
import java.util.Set;

public class removeDublicate {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        nonDublicate(array);
    }
    public static void nonDublicate(int[] array ){
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < array.length ; i++) {
            ans.add(array[i]);

        }
        Object[] arr = ans.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
