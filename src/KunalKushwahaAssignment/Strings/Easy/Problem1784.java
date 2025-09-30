package KunalKushwahaAssignment.Strings.Easy;

public class Problem1784 {
    public static void main(String[] args) {

        char name = 'K';
        System.out.println(Integer.toBinaryString(name).replace(' ','0'));
        System.out.println(Integer.toBinaryString(name));
        int binary = Integer.parseInt(Integer.toBinaryString(name));
        System.out.println(binary);

    }

    public static boolean checkOnesSegment(String s) {
        for (int i = 0; i < s.length(); i++) {
            String binary = Integer.toBinaryString(s.charAt(i));
            int number = occurence(binary);
            for (int j = 0; j < occurence(binary); j++) {
                if(j+1 < s.length() && binary.charAt(j) != binary.charAt(j+1) ){
                    return false;
                }
            }
        }
        return true;
    }
    public static int occurence(String number ){
        int ans = 0;
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}
