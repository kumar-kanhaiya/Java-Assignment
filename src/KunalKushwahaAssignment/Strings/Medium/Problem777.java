package KunalKushwahaAssignment.Strings.Medium;

public class Problem777 {
    public static void main(String[] args) {
        String start = "RXXLRXRXL";
        String result = "XRLXXRRLX";

        System.out.println(canTransform(start,result));

    }

    // 1st approach
    public static boolean canTransform2(String start, String result) {
        if(start.length() < 2 || result.length() < 2
                || start.length() != result.length()){
            return false;
        }

        // String is immutable
        StringBuilder first = new StringBuilder();
        first.append(start.toCharArray());
        StringBuilder second = new StringBuilder();
        second.append(result.toCharArray());

        int i1 = 0;

        int j1 = 0;


        while(i1 < first.length()-1 && j1 < second.length()-1){
            int i2 = i1+1;
            int j2 = j1+1;
            if(first.charAt(i1) == 'R' && second.charAt(j1) == 'X'
                    && first.charAt(i2) == 'X' && second.charAt(j2) == 'R'){
                first.setCharAt(i1,'X');
                first.setCharAt(i2,'R');
                i1 = i1 + 2;
                j1 = j1 +2;
            }
            else if(first.charAt(i1) == 'X' && second.charAt(j1) == 'L'
                    && first.charAt(i2) == 'L' && second.charAt(j2) == 'X'){
                first.setCharAt(i1,'L');
                first.setCharAt(i2,'X');
                i1 = i1 + 2;
                j1 = j1 +2;
            }
            else{
                i1++;
                j1++;
            }

        }
        System.out.println(first);
        System.out.println(second);
        return first.toString().equals(second.toString());
    }

    //2nd approach
    public static boolean canTransform(String start , String result){
        if(start.length() <2 || result.length() <2
                || start.length() != result.length()){
            return false;
        }

        // by removing all 'X'
        String first = start.replace("X","");
        String second = result.replace("X","");

        if(!first.equals(second)){
            return false;
        }

        int n = start.length();

        int i = 0 ,j  = 0;
        while( i<n && j<n){

            while(i<n && start.charAt(i)=='X'){
                i++;
            }
            while(j<n && start.charAt(j)=='X'){
                j++;
            }

            if(i==n || j== n){
                break;
            }

            char c = start.charAt(i);

            if(c == 'L' && i < j){
                return false;
            }
            if(c == 'R' && i>j){
                return false;
            }
            i++;
            j++;

        }
        return true;

    }
}
