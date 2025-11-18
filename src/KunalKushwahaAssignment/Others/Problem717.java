package KunalKushwahaAssignment.Others;

import java.util.Stack;

public class Problem717 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0};
        System.out.println(isOneBitCharacter(arr));

    }

    public static boolean isOneBitCharacter(int[] bits){
//        if(bits.length <= 1){
//            return true;
//        }
//        if(bits[bits.length -1] == bits[bits.length - 2]){
//            return true;
//        }
        if(bits.length == 1 && bits[bits.length -1] == 0){
            return true;
        }

        // checking the case 10 and 11
        for (int i = 0; i < bits.length ; ) {
            if(bits[i] == 1){
                i = i+2;
            }
            else{
                i = i+1;
            }
            if(i == bits.length-1 && bits[i] == 0){
                return true;
            }

        }
        return false;

    }
}
