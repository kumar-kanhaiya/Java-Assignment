package KunalKushwahaAssignment.Others;

public class Problem168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));

    }

    public static String convertToTitle(int columnNumber) {
        int check = 65;
        String ans = "";
        int j = 1;
        String main = "";
        for (int i = 1; i <= columnNumber ; i++) {
            main = String.valueOf((char)(j+64));
            if(i%26 == 0){
                ans = String.valueOf((char)check++);
                j = 1;
            }
        }
        return ans+main;
    }

    //2nd approach
    public static String convertToTitle1(int columnNumber){
        String ans = "";

        String main = "";

        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            main = String.valueOf((char)(rem+65));
            ans = main +  ans;
            columnNumber /=26;
        }
        return ans;
    }
}
