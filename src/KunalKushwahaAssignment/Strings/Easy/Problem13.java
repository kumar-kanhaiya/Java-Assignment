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
                ans += 1;
            }
            else if(check == 'V'){
                ans += 5 ;
            }
            else if(check == 'X'){
                ans += 10;
            }
            else if(check == 'L'){
                ans += 50;
            }
            else if(check == 'C'){
                ans += 100;
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
