package KunalKushwahaAssignment.Sorting.Easy;

public class Problem976 {
    public static void main(String[] args) {

    }

    public static int largestPerimeter(int[] array) {
        insertionSort(array);
        // select three element ;
        // base case check
        int ans = 0;
        if(array.length<3){
            return 0;
        }
        int i = 0;
        while(i< array.length && i+2 < array.length){
            int first = i;
            int second = i+1 ;
            int third = i+2;
            boolean check = helper(first,second,third);
            if(check){
                // finding the area ;
                int ch = area(first,second,third);
                ans = Math.max(ch,ans);
            }
            i++;
        }

    }
    public static boolean helper(int a , int b , int c ){
        return (a+b >c && b+c> a && a+c>b);
    }
    // sort the array
    public static void insertionSort(int[] array ){
        for (int i = 0; i <= array.length - 1 ; i++) {
            int j = i;
            while(j>0 && array[j-1]>array[j]){
                swap(array,j-1,j);
                j--;
            }

        }
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] =temp;
    }

    public static int area(int a , int b , int c){
        float s = (a+b+c)/2f;
        int result = (int) (s*(s-a)*(s-b)*(s-c));
        int area = (int)Math.pow(result,0.5);
        return area;
    }
}
