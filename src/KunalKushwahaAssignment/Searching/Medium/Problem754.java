package KunalKushwahaAssignment.Searching.Medium;

public class Problem754 {
    public static void main(String[] args) {
        System.out.println(reachNumber(3));

    }
    public static int reachNumber(int target) {
        // we solve this problem using binary search
        if(target == 0){
            return 0;
        }
        int i = 1 ;
        int steps = 0;
        int start = 0 ;
        while(start != target){
            if((start + i ) ==  target || (start - i) == target){
                return steps;
            }

            if(start+i > target){
                start = start - i;
                i++;
            }
            else{
                start = start + i;
                i++;
            }
        }
        return steps;

    }
}
