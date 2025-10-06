package KunalKushwahaAssignment.Strings.Medium;

import java.util.Arrays;

public class Problem556 {
    public static void main(String[] args) {
        int n = 985;
        System.out.println(sortNumber(n));


    }

    public static int nextGreaterElement(int n) {
        int number = sortNumber(n);
        int ans =
        return 0;

    }
    public static int sortNumber(int number){
        String check = number + "";
        String[] array = check.split("");
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arr);
        int index = 0;
        int num = 0;
        while(index < arr.length){
            num = num*10 + arr[index];
            index++;
        }
        return num;
    }
}
