package KunalKushwahaAssignment.Patterns;

public class Pattern3 {
//    *
//    **
//    ***
//    ****
//    *****

    static void main() {
        pattern(5);
    }
    public static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int columns = 0; columns < row ; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
