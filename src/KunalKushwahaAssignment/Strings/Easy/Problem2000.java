package KunalKushwahaAssignment.Strings.Easy;

public class Problem2000 {
    public static void main(String[] args) {
        String word = "abcd";
        System.out.println(reversePrefix(word,'z'));

    }

    public static String reversePrefix(String word, char ch) {
        int index = 0;
        StringBuilder builder = new StringBuilder();
        while(index < word.length()){
            if(word.charAt(index) == ch){
                builder.append(word.charAt(index));
                index++;
                break;
            }
            else{
                builder.append(word.charAt(index));
            }
            index++;
        }
        if(index != word.length() || word.charAt(word.length()-1) == ch) {
            builder = builder.reverse();
        }
        while(index < word.length()){
            builder.append(word.charAt(index));
            index++;
        }

        return builder.toString();

    }
}
