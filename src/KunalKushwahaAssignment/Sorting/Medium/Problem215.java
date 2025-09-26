package KunalKushwahaAssignment.Sorting.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem215 {
    public static void main(String[] args) {
        int[] array = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(array,4));

    }

    // this problem is done without using sorting algo
    public static  int findKthLargest1(int[] nums, int k) {
        // remove duplicate element

        ArrayList<Integer> list = new ArrayList<>();
        for(int element : nums){
            list.add(element);
        }
        while(k != 1){
            int max = maxIndex(list);
            list.remove(max);
            k--;

        }
        int max = maxIndex(list);
        return list.get(max);

    }
    public  static int maxIndex(ArrayList<Integer> list ){
        int max = 0;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) > list.get(max)){
                max = i;
            }
        }
        return max;
    }
    public static int findKthLargest2(int[] arraay , int k){
        ArrayList<Integer> list = new ArrayList<>();
        for(int element : arraay){
            list.add(element);
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 1;
        while(i <= k){
            int max = maxIndex(list);
            map.put(i,list.get(max));
            list.remove(max);
            i++;
        }
        return  map.get(k);
    }

    public static int findKthLargest(int[] array , int k ){

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : array){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }

}
