package KunalKushwahaAssignment.Strings;

public class Problem1108 {
    public static void main(String[] args) {
        String ch = "1.1.1.1";
        System.out.println(defangIPaddr(ch));

    }
    public static String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < address.length() ; i++) {
            char c = address.charAt(i);
            if(c == '.'){
                stringBuilder.append("[.]");


            }
            else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
