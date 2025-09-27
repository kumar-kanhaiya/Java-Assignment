package KunalKushwahaAssignment.Strings;

public class Problem1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indicies = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indicies));

    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < indices.length ; i++) {
            stringBuilder.append(s.charAt(indices[i]));
        }
        return stringBuilder.toString();
    }
}
