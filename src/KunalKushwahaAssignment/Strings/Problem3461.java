package KunalKushwahaAssignment.Strings;

public class Problem3461 {
    public static void main(String[] args) {
        String s = "3902";
        System.out.println(hasSameDigits(s));

    }

    public static boolean hasSameDigits(String s) {
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return true;
            }
            return false;
        }

        while(s.length() > 2){
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < s.length()-1 ; i++) {
                int digit1 = s.charAt(i) - '0';
                int digit2 = s.charAt(i+1) - '0';
                int sum = (digit1+digit2)%10;
                newStr.append(sum);
            }

            s = newStr.toString();
        }
        return s.charAt(0)== s.charAt(1);
    }
}
