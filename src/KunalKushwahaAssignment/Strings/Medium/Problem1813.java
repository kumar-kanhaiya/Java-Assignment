package KunalKushwahaAssignment.Strings.Medium;

public class Problem1813 {
    public static void main(String[] args) {
        String sentence1 =  "Eating right now";
        String sentence2 = "Eating";
        System.out.println(areSentencesSimilar(sentence1,sentence2));

    }

    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String small = "";
        String large = "";

        if(smallest(sentence1,sentence2)){
            small = sentence2;
            large = sentence1;
        }
        else{
            small = sentence1;
            large = sentence2;
        }
        String[] word = large.split(" ");
        String[] word2 = small.split(" ");

        int start = -1 ;
        int end = 0;
        for (int i = 0; i < word.length ; i++) {
            if(word2[0].equals(word[i])){
                start = i;
            }
            if(word2[word2.length-1].equals(word[i]) && word2.length>1){
                end = i;
            }
        }
        if(start != 0 && end == 0){
            return true;
        }

        if(end == 0){
            return false;
        }


        return true;

    }

    public static boolean smallest(String s , String p){
        return s.length()>p.length() ? true:false;
    }

}
