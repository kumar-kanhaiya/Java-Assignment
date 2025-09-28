package KunalKushwahaAssignment.Strings.Easy;

public class Problem657 {
    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle(moves));

    }

    public static boolean judgeCircle(String moves) {
        int row = 0;
        int coll = 0;
        for (int i = 0; i < moves.length() ; i++) {
            char ch = moves.charAt(i);
            if(ch == 'R'){
                coll++;
            }
            else if(ch == 'L'){
                coll--;
            }
            else if (ch == 'U' ){
                row--;
            }
            else{
                row++;
            }
        }
        return (row==0 && coll==0);
    }
}
