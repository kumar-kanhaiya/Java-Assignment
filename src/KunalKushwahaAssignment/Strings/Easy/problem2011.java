package KunalKushwahaAssignment.Strings.Easy;

public class problem2011 {
    public static void main(String[] args) {
        String[] operation = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operation));

    }

    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for (int i = 0; i < operations.length ; i++) {
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                ans = ans + 1;
            }
            else{
                ans = ans - 1;
            }
        }
        return ans;
    }
}
