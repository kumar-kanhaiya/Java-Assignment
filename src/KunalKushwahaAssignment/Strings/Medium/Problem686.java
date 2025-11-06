package KunalKushwahaAssignment.Strings.Medium;

import java.util.Scanner;

public class Problem686 {
    public static void main(String[] args) {
//        String a = "abcd";
//        String b = "cdabcdab";
//        System.out.println(repeatedStringMatch(a,b));
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        System.out.println(number);
//        float n = input.nextFloat();
//        System.out.println(n);
//
//        String name = input.nextLine();
//        System.out.println(name);
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a,b));

    }

    public static int repeatedStringMatch(String a, String b) {
        String real = a;
        int ans =1;
        if(b.contains(a) && b.length() < a.length()){
            return 1;
        }
        int i = 0;
        int end = (int)Math.ceil(b.length() / a.length());
        while(i<=end+2){
            if(a.contains(b)){
                return ans;
            }
            else{
                a += real ;
                ans++;
                i++;
            }
        }
        return -1;
    }
}
