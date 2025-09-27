package KunalKushwahaAssignment.Strings;

public class Problem1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));

    }
    public static String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <command.length() ; i++) {
            if(i+1 < command.length() && command.charAt(i) == '(' && command.charAt(i+1) ==')' ){
                stringBuilder.append('o');
            }
            if(i+3 < command.length() && command.charAt(i) == '(' && command.charAt(i+1) == 'a'
                    && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                stringBuilder.append("al");
            }
            if(command.charAt(i) == 'G'){
                stringBuilder.append('G');
            }
        }
        return stringBuilder.toString();
    }
}
