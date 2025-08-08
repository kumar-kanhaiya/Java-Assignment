package KunalKushwahaAssignment.Array.Medium;

public class Problem73 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,0,6},{7,8,9}};
        setZeroes(array);
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }


}

