package KunalKushwahaAssignment.Searching.Easy;

public class problem1346 {
    public static void main(String[] args) {
        int[] array = {0,0};
        System.out.println(checkIfExist(array));
    }
    // this is normal approach
        public static boolean checkIfExist(int[] arr) {
        int count = 0;
            for(int a : arr){
                if(a == 0){
                    count++;
                }
                for(int b : arr){
                    if(count >=2){
                        return true;
                    }
                    if( a == b*2 && a!=b){
                        return true;
                    }
                }
            }

            return false;
        }
    // but we can do with binary search
    public static boolean checkIfExist1(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            for (int i = 0 ; i<= end ; i++){
                if(arr[start] == arr[i]){
                    continue;
                }
                if(arr[start] == 2 * arr[i]){
                    return true;
                }
            }
            start ++ ;

        }
    return false;
    }
}
