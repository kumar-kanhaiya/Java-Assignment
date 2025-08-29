    package KunalKushwahaAssignment.Searching.Medium;

    public class Problem754 {
        public static void main(String[] args) {
            System.out.println(reachNumber(4));

        }
        public static int reachNumber(int target) {
            // we solve this problem using binary search
            if(target == 0){
                return 0;
            }
            int i = 1 ;
            int steps = 1;
            int sum = 0 ;
            while(sum >= target && (sum - target) % 2 == 0){
//                sum = sum+i;
//                if((sum ) ==  Math.abs(target) ){
//                    return steps;
//                }

                if(sum +i > Math.abs(target)){
                    if(sum >= target && (sum - target)%2 == 0 ){
                        return steps;

                    }
                    else{
                        sum += 1;
                        steps++;
                        i++;
                    }
                }
                else{
                    sum = sum + i;
                    steps++;
                    i++;
                }
            }
            return steps;

        }
    }
