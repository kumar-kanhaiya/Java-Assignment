package KunalKushwahaAssignment.Others;

public class Problem67 {
    static void main() {
        String s = "625";
        System.out.println(addBinary3("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
//        System.out.println(binaryToInt("111"));
        System.out.println("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"==
                "101100010100010001000000001001100000000100000100010001000000000000110100010000110001110000000000000");
//        System.out.println(addBinary("1010","1011"));

//        StringBuilder ans = new StringBuilder();
//        ans.append('1');
//        String ans = "";
//        ans += "1";
//        ans = "2" + ans;
//        System.out.println(ans.toString());

    }
    public static String addBinary2(String a, String b) {
        int result = binaryToInt(a) + binaryToInt(b);


       return Integer.toBinaryString(result);
    }
    public static int binaryToInt(String s){
        long ans = 0;
        int pow = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            ans += Integer.parseInt(s.charAt(i)+"") * (int)Math.pow(2,pow);
            pow++;
        }
        return (int)ans;
    }

    // 2nd approach and correct approach
    public static String addBinary(String a, String b){
        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;
        String ans = "";
        while(i>= 0 && j>=0){
            if(a.charAt(i) == '1' && b.charAt(j)=='1'){
                if(carry  == 0){
                    ans = "0"+ ans;
                    carry =1;
                    i--;
                    j--;
                }
                else{
                    ans = "0" + ans;
                    carry = 1;
                    i--;
                    j--;
                }
            }
            else if(a.charAt(i) == '1' && b.charAt(j)=='0' || a.charAt(i) == '0' && b.charAt(j)=='1'){
                if(carry == 0){
                    ans = "1"+ ans;
                    carry = 0;
                    i--;
                    j--;
                }
                else{
                    ans = "0"+ ans;
                    carry =1;
                    i--;
                    j--;
                }
            }
            else{
                if(carry == 0){
                    ans = "0"+ ans;
                    i--;
                    j--;
                }
                else{
                    ans = "1"+ ans;
                    i--;
                    j--;
                }
            }
        }
        while(i>=0 ){
            if(a.charAt(i) == '1'){
                if(carry== 0){
                    ans = "1"+ ans;
                    i--;
                }
                else{
                    ans = "0"+ ans;
                    carry = 1;
                    i--;
                }
            }
            else{
                if(carry == 0){
                    ans = "0"+ ans;
                    i--;
                }
                else{
                    ans = "1"+ ans;
                    carry = 0;
                    i--;
                }
            }
        }
        while( j>=0){
            if(b.charAt(j) == '1'){
                if(carry== 0){
                    ans = "1"+ ans;
                    j--;
                }
                else{
                    ans = "0"+ ans;
                    carry = 1;
                    j--;
                }
            }
            else{
                if(carry == 0){
                    ans = "0"+ ans;
                    j--;
                }
                else{
                    ans = "1"+ ans;
                    carry = 0;
                    j--;
                }
            }
        }
        if(carry == 1){
            ans = "1"+ ans;
        }
        return ans;
    }

    // correct and final one
    public static String addBinary3(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }

}
