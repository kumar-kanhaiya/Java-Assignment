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
            int steps = 0;
            int sum = 0 ;
            while(true){
                sum = sum + i;
                steps++;
                if(sum >= Math.abs(target) && (sum - Math.abs(target))%2 == 0){
                    return steps;
                }
                else{
                    i++;
                }
            }


        }
        public int reachNumber2(int target) {
            target=Math.abs(target);
            int sum=0,k=0;
            while(sum<target || (sum-target)%2!=0){
                k++;
                sum+=k;

            }
            return k;



        }
    }
