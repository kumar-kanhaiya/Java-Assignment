package KunalKushwahaAssignment.Strings.Medium;

import java.util.Scanner;

public class Problem686 {
    public static void main(String[] args) {
//        String a = "abcd";
//        String b = "cdabcdab";
//        System.out.println(repeatedStringMatch(a,b));
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number);
        float n = input.nextFloat();
        System.out.println(n);

        String name = input.nextLine();
        System.out.println(name);

    }

    public static int repeatedStringMatch(String a, String b) {
        int ans = 1;
        if(!b.contains(a)){
            return ans;
        }
        while(!a.contains(b)){
             a+= a;
             ans++;
        }
        return ans;
    }
}
