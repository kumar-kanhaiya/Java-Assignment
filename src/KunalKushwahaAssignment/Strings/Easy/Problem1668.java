package KunalKushwahaAssignment.Strings.Easy;

public class Problem1668 {
    public static void main(String[] args) {
        String s = "ababc";
        System.out.println(maxRepeating(s,"ac"));

    }

    public static int maxRepeating(String sequence, String word) {
        int ans = 0;
        for (int i = 0; i < sequence.length(); i++) {
            StringBuilder builder = new StringBuilder();
//            builder.append(sequence.charAt(i));
            int j = 0;
            while(j< word.length() && j+i < sequence.length()){
                builder.append(sequence.charAt(j+i));
                j++;
            }
            if(builder.toString().equals(word)){
                ans++;
            }
        }
        return ans;
    }
}
