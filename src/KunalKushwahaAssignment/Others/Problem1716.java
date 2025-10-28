package KunalKushwahaAssignment.Others;

public class Problem1716 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));

    }

    public static int totalMoney1(int n) {
        int ans = 0;
        int j =1;

        for (int i = 1; i <=n ; i++) {
            if(j==8){
                j = 1;
            }
            if(i<=7){
                ans += j++;
            }
            else{
                ans += j + i%7;
            }
        }

        return ans;
    }

    //2nd approach
    public static int totalMoney(int n){
        int ans = 0;
        int j = 1;
        int week = 0;
        for (int i = 1; i <= n ; i++) {
            ans += week + j++;

            if(i%7 == 0){
                week++;
                j=1;
            }


        }
        return ans;
    }
}
