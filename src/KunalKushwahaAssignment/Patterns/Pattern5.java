package KunalKushwahaAssignment.Patterns;

public class Pattern5 {
    static void main() {
        pattern(5);

    }
//    5.      *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *

    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int j = n-1; j >0 ; j--) {
            for (int i = 1; i <= j ; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
