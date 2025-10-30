package KunalKushwahaAssignment.Others;

public class Problem3370 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(10));
        System.out.println(Integer.bitCount(15));
    }

    public static int smallestNumber(int n) {
        String bit = Integer.toBinaryString(n);
//        int bitValue = numberOfOne(bit);
        while(true){
            if(Integer.bitCount(n) == bit.length()){
                return n;
            }
            else{
                n ++;
            }
        }

    }

    public static int numberOfOne(String n){
        int ans = 0;
        for (int i = 0; i <n.length() ; i++) {
            if(n.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }

}
