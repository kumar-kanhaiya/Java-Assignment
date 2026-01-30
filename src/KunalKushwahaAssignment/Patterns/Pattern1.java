package KunalKushwahaAssignment.Patterns;

public class Pattern1 {
    static void main() {
//        1.      *****
//                *****
//                *****
//                *****
//                *****
        pattern(5);

    }
    public static void pattern(int n){
        for (int row = 0; row <n ; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
