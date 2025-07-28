package KunalKushwahaAssignment.Array.Easy;

public class leetcode1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpso";
        System.out.println(checkIfPangram(sentence));

    }
    public static boolean checkIfPangram(String sentence) {
        for (int i = 0; i < 26 ; i++) {
            int j = 0;
            boolean isCheck = false;
            while(j<sentence.length()){
                if(i+97 == (int) sentence.charAt(j)){
                    isCheck = true;
                    break;
                }
                j++;
            }
            if(isCheck ==false){
                return false;
            }
        }
        return true;
    }
}
