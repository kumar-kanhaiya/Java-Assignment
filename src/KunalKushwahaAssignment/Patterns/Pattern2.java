package KunalKushwahaAssignment.Patterns;

public class Pattern2 {
//            *****
//            ****
//            ***
//            **
//            *

    static void main() {
        pattern(5);
    }
    public static void pattern(int n){
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n-row ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
