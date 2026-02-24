package A2Z_DSA_Sheet.LearnBasic;

import java.util.Arrays;

public class BasicRecursion {
    static void main() {
        System.out.println(recursiveName(3));
        printNumber(4);
        System.out.println();
        printNumberFromLast(4);
        System.out.println();
        System.out.println(sumOfFirstNNumber(4));
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static String recursiveName(int n){
        // base condition
        if(n == 0){
            return "";
        }
        return "kanhaiya " + recursiveName(n-1);
    }
    static void printNumber(int n){
        if(n == 0){
            return;
        }
        printNumber(n-1);
        System.out.print(n);
    }

    static void printNumberFromLast(int n ){
        if(n == 0){
            return;
        }
        System.out.print(n);
        printNumberFromLast(n-1);
    }

    static int sumOfFirstNNumber(int n ){
        if(n== 0){
            return 0;
        }
        return n+ sumOfFirstNNumber(n-1);
    }

    static void reverseArray(int[] array){
        helper(array,0, array.length-1);
    }
    static void helper(int[] array , int start , int end){
        if(start == end || start < end){
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end]= temp;
        helper(array,start+1,end-1);
    }

}
