package KunalKushwahaAssignment.Strings.Medium;

public class Problem43 {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(Integer.parseInt(num1) * 987654321 );
        System.out.println(multiply(num1,num2));

    }

    public static String multiply(String num1, String num2) {
        long result = (Integer.parseInt(num1) * Integer.parseInt(num2));
        StringBuilder builder = new StringBuilder();
//        while(result >=0){
//            builder.append(result%10 + '0');
//            result /=10;
//        }
        builder.append(String.valueOf(result));
        return builder.toString();

    }
}
