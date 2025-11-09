package KunalKushwahaAssignment.Strings.Medium;

public class Problem1750 {
    public static void main(String[] args) {
        String s = "kanhaiya";
        System.out.println(minimumLength("cabaabac"));

    }

    public static int minimumLength(String s) {
        if(s.length() == 1){
            return 1;
        }
        int ans = 0;
//        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            int start = 0;
            int end = s.length()-1;
            char ch = s.charAt(0);
            if(s.charAt(start) != s.charAt(end)){
                return s.length();
            }

            // checking the starting index
            while(s.charAt(start) == ch){
                start++;
            }
            // checking the ending index
            while(s.charAt(end) == ch){
                end--;
            }


            s = s.substring(start , end+1);
            i=0;



        }

        return s.length();

    }
}
