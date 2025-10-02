package KunalKushwahaAssignment.Strings.Easy;

public class Problem1871 {
    public static void main(String[] args) {
        String s = "011010";
        System.out.println(canReach(s,2,3));

    }

    public static boolean canReach(String s, int minJump, int maxJump) {
        int index = 0;
        while(index< s.length()){
            if(index+minJump < s.length() && index+ maxJump < s.length()
                    && s.charAt(index+minJump) != '0' && s.charAt(index+maxJump) != '0'){
                return false;
            }
            if(index+minJump < s.length() && s.charAt(index + minJump) == '0'){
                index = index+minJump;
            }
            if(index+maxJump < s.length() && s.charAt(index + maxJump) == '0'){
                index = index + maxJump;
            }
        }
        if(index == s.length()-1){
            return true;
        }
        return false;
    }
}
