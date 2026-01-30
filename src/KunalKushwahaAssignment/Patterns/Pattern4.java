package KunalKushwahaAssignment.Patterns;

public class Pattern4 {
//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5

    static void main() {
        pattern(5);
    }

    public static void pattern(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
