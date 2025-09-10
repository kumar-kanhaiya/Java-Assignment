public class Demo {
    public static void main(String[] args) {
        System.out.println(recursiveCall(5));

    }
    public static int recursiveCall(int number){
        return helper(number , 0);
    }

    public static int helper(int number , int count ){
        // base case
        if(number == 0){
            return count;
        }
        if(number%2 !=0){
          return  helper(number - 1 , count + 1);

        }
        return helper(number - 2 , count + 1);

    }
}
