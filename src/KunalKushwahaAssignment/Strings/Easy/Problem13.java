package KunalKushwahaAssignment.Strings.Easy;

public class Problem13 {
    public static void main(String[] args) {
        String s =  "MCMXCIV";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if(check == 'I'){
                if(i+1 < s.length() && s.charAt(i+1) == 'V' ){
                    ans += 4;
                    i = i+1;
                }
                else if(i+1 < s.length() && s.charAt(i+1) == 'X'){
                    ans += 9;
                    i += 1;
                }
                else {
                    ans += 1;
                }
            }
            else if(check == 'V'){
                ans += 5 ;
            }
            else if(check == 'X'){
                if(i+1 < s.length() && s.charAt(i+1) == 'L' ){
                    ans += 40;
                    i = i+1;
                }
                else if(i+1 < s.length() && s.charAt(i+1) == 'C'){
                    ans += 90;
                    i += 1;
                }
                else {
                    ans += 10;
                }
            }
            else if(check == 'L'){
                ans += 50;
            }
            else if(check == 'C'){
                if(i+1 < s.length() && s.charAt(i+1) == 'D' ){
                    ans += 400;
                    i = i+1;
                }
                else if(i+1 < s.length() && s.charAt(i+1) == 'M'){
                    ans += 900;
                    i += 1;
                }
                else {
                    ans += 100;
                }
            }
            else if(check == 'D'){
                ans += 500;
            }
            else{
                ans += 1000;
            }
        }
        return ans;
    }
}
