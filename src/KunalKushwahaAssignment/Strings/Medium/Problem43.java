package KunalKushwahaAssignment.Strings.Medium;

public class Problem43 {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(Integer.parseInt(num1) * 987654321 );
        System.out.println(multiply(num1,num2));

    }

    // work for small value
    public static String multiply2(String num1, String num2) {

        long ans = 0;
        long second = Long.parseLong(num2);
        int placeValue = 1 ;
        while(second>0){
            ans += (Integer.parseInt(num1) * (second % 10))
                    * placeValue ;
            placeValue *=10;
            second /=10;
        }

        return String.valueOf(ans);

    }

    // second approach for long value
    public static String multiply(String num1 , String num2){
        // condition check
        if(num1.equals("0") && num2.equals("0")){
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        int[] ans = new int[m+n];

        // loop
        for (int i = m-1; i >=0 ; i--) {
            for (int j = n-1; j >=0 ; j--) {
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = multiply + ans[i+j+1]; // use for carry sum
                ans[i+j+1] = sum%10; // this is the main multiply
                ans[i+j] += sum/10; // basically this is the carry
            }
        }
        StringBuilder finalAns = new StringBuilder();
        for(int digit : ans){
            if(!(finalAns.length() == 0 && digit == 0)){
                finalAns.append(digit);
            }
        }
        return finalAns.length() == 0 ? "0" : finalAns.toString();
    }
}
