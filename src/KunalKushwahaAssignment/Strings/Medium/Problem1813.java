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
            String[] word1 = large.split(" ");
            String[] word2 = small.split(" ");

            int i = 0;
            int j = 0;
            while(i < word2.length && word1[i].equals(word2[i])){
                i++;
            }
            while(j < word2.length && j < word1.length &&
                    word1[word1.length - 1 - j].equals(word2[word2.length - 1 - j])){
                j++;
            }

            if(i + j >= word2.length){
                return true;
            }
            return false;

        }

        public static boolean smallest(String s , String p){
            return s.length()>p.length() ? true:false;
        }

    }
