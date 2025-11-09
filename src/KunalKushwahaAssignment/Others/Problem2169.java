package KunalKushwahaAssignment.Others;

public class Problem2169 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        System.out.println(countOperations(num1,num2));

    }

    public static int countOperations(int num1, int num2) {
        if(num1 ==0 || num2 == 0){
            return 0;
        }
        int ans = 1;
        while(num1 != 0 || num2 != 0){
            if(num1 - num2 == 0 || num2 - num1 == 0){
                return ans ;
            }
            else if(num2 > num1){
                num2 = num2 - num1;
                ans++;
            }
            else{
                num1 = num1 - num2;
                ans++;
            }
        }

        return ans;
    }
}
