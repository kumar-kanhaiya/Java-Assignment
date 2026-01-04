package KunalKushwahaAssignment.Others;

public class Problem1390 {
    static void main() {
        int[] arr = {1,2,3,4,5};
        for (int i = 1; i * i <= 21; i++) {
            if (21 % i == 0) {
                System.out.println(i);          // smaller divisor
                if (i != 21 / i) {
                    System.out.println(21 / i); // paired divisor
                }
            }
        }
        System.out.println(sumFourDivisors(arr));

    }

    public static int sumFourDivisors(int[] arr) {
        int ans = 0;
//        Arrays.sort(nums);
        for (int i = 0; i < arr.length; i++) {
            // find the divisor
            int number = arr[i];
            int count = 0;
            int check = 0;
            for (int j = 1; j * j <= number; j++) {
                if (number% j == 0) {
                    count++;
                    check += j;
                    if (j != number / j) {
                       count++;
                       check += number/j;
                    }
                }
            }
            if(count == 4){
                ans += check;
            }

        }
        return ans;
    }
}
