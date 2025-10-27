package KunalKushwahaAssignment.Strings.Medium;

public class Problem2125 {
    public static void main(String[] args) {
        String[] arr = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(arr));

    }
    public  static  int numberOfBeams(String[] arr) {

        int prev  = 0;
        int ans = 0;

        int n = arr.length;
        for(int i = 0 ; i < n ; i++){

            int count = 0;
            for(char c : arr[i].toCharArray()){
                if(c == '1'){
                    count++;
                }
            }

            if(count == 0){
                continue;
            }
            else{
                ans += count*prev;
                prev = count;
            }
        }
        return ans;
    }
}
