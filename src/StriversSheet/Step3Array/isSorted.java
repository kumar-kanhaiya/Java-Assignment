package StriversSheet.Step3Array;
// leetcode - 1752
// very good question
public class isSorted {
    public static void main(String[] args) {
        int[] array = {2,1,3,4};
        System.out.println(check(array));
    }
//    public static boolean check(int[] array) {
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length ; j++) {
//                if(array[j-1] > array[j]){
//                    if(array[j] > array[0] || array[array.length-1]> array[0]){
//                        return false;
//                    }
//                    else if (j == array.length -1 ){
//                        return true;
//                    }
//                    else{
//                        continue;
//                    }
//                }
//            }
//        }
//        return true;
//    }
    // second approche

    public static boolean check(int[] array){
        int len = array.length;
        int deviation = 0;
        for (int i = 0; i < len; i++) {
            if(i < len - 1 && array[i] > array[i+1]){
                deviation++;
            }
            else if(i == len -1 && array[len - 1 ] > array[0]){
                deviation++;
            }
            
        }
        if(deviation > 1){
            return false;
        }
        return true;
    }
}
