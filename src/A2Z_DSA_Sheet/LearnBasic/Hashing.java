package A2Z_DSA_Sheet.LearnBasic;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    static void main() {
        // Input array
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr,n);
        countFreqUsingHashMap(arr,n);

    }

    public static void countFreq(int[] arr, int n){
        // first we create a boolean array
        boolean[] visited = new boolean[n];

        // now use two pointer approach
        for (int i = 0; i < n; i++) {
            if(visited[i]){
                continue;
            }

            int count = 1;
            for (int j = i+1; j <n ; j++) {
                if(arr[i]== arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            // Output the element and its count
            System.out.println(arr[i] + " " + count);
        }

    }

    // using hashmap
    public static void countFreqUsingHashMap(int[] arr , int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        // traverse
        for (int i = 0; i <n ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i] , 0) +1);
        }
//        output
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
