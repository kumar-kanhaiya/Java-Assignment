package KunalKushwahaAssignment.Searching.Easy;

public class Problem888 {
    public static void main(String[] args) {

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // we do this question with the help of binary search
        int i = 0;
        int j = 0;
        int[] firstCopy = new int[aliceSizes.length];
        int[] secondCopy = new int[bobSizes.length];

        while(i< aliceSizes.length && j < bobSizes.length){

        }
    }

//    public static void swap(int[] array , int first , int second){
//        int temp = array[first];
//        array[first] = array[second];
//        array[second] = temp;
//    }
    public static boolean isSumEqual(int[] first  , int[] second){
        int sum1 = 0;
        for(int element : first){
            sum1 += element;
        }
        int sum2 = 0;
        for(int element : second){
            sum2 += element;
        }
        if(sum1 == sum2){
            return true;
        }
        return false;
    }
}
