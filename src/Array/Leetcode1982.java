package Array;

public class Leetcode1982 {
    // done with 65.50% beats
    public static void main(String[] args) {
        String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(Method2(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean check = false;
        for (int i = 0; i <sentence.length() ; i++) {
            int d = sentence.charAt(i);
            if(d>=97 && d<=122 && sentence.length() >= 24){
                check = true;

            }
            else{
                check = false;
            }
        }
        return check;
    }
    public static boolean Method2(String sentence){
        boolean[] check = new boolean[26];
        for (int i = 0; i <sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            if(ch >='a' && ch<='z'){
                check[ch - 'a'] = true;
            }
            else{
                check[i] = false;
            }
        }
        for (int i = 0; i < check.length ; i++) {
            if(check[i] == false){
                return false;
            }
        }
        return true;
    }
}
