package KunalKushwahaAssignment.Patterns;

public class Pattern6 {
    static void main() {
        pattern(5);

    }
//    6.         *
//              **
//             ***
//            ****
//           *****

    public static void pattern(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >=i ; j--) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
