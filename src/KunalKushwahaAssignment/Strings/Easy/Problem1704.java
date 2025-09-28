package KunalKushwahaAssignment.Strings.Easy;

public class Problem1704 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(s.substring(0,s.length()/2));
        System.out.println(s.substring(s.length()/2,s.length()));
        System.out.println(halvesAreAlike(s));

    }


    public static boolean halvesAreAlike(String s) {
        String first = s.substring(0,s.length()/2);
        String second = s.substring(s.length()/2 ,s.length());
        return (noOfVowels(first) == noOfVowels(second));

    }

    public static int noOfVowels(String s ){
        int ans = 0;
        for (int i = 0; i < s.length() ; i++) {
            char check = s.charAt(i);
            if(check == 'a' || check == 'e' || check == 'i' || check =='o' || check =='u'
                    || check == 'A' || check == 'E' || check == 'I' || check =='O' || check =='U'){
                ans++;
            }
        }
        return ans;
    }
}
