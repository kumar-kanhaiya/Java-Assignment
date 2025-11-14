package KunalKushwahaAssignment.Strings.Medium;

public class Problem1750 {
    public static void main(String[] args) {
        String s = "kanhaiya";
        System.out.println(minimumLength2("aabccabba"));

    }

    public static int minimumLength(String s) {
        if(s.length() == 1){
            return 1;
        }

//        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            int start = 0;
            int end = s.length()-1;
            char ch = s.charAt(0);
            if(s.charAt(start) != s.charAt(end)){
                return s.length();
            }

            // checking the starting index
            while(s.charAt(start) == ch && start < s.length()-1){
                start++;
            }
            // checking the ending index
            while(s.charAt(end) == ch && end > 0){
                end--;
            }


            s = s.substring(start , end+1);
            i=0;



        }

        return s.length();

    }

    //2ndd approach

    public static int minimumLength2(String s ){
        int start = 0;
        int end = s.length() -1 ;

        while(start < end && s.charAt(start) == s.charAt(end)){

            char ch = s.charAt(start);

            while(start <= end && s.charAt(start) == ch){
                start++;
            }

            while(start <= end && s.charAt(end) == ch){
                end--;
            }

        }
        return end - start +1;

    }
}
