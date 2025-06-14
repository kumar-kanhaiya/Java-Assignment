package JAVACHALLENGE100Days.Day8;

public class Problem_3 {
    public static void main(String[] args) {
        // repeated word in String
        String name = "abababab";
        repeated(name);

    }
    public static void repeated(String input){
        input = input.toLowerCase();
        for (int i = 0; i <input.length() ; i++) {
            char index = input.charAt(i);
            int count = 0;
            for (int j = i+1; j < input.length() ; j++) {
                if(index == input.charAt(j)){
                    count++;
                }
            }
            if(count > 0){
                System.out.print(index);
            }

        }
    }
}
