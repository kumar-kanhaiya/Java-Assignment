package A2Z_DSA_Sheet.LearnImportantSorting.ArrayProblems.Easy;

public class SecondLargest {
    static void main(String[] args) {

    }

    // first approach
    // sort the array then find return last second element which is second largest element
    // and also return 2nd element which is second smallest element
    public static void secondLargestApproach1(int[] array){
        bubbleSort(array);
        System.out.println("Second Largest Element :- "+ array[array.length -2]);
        System.out.println("Second Smallest Element :- "+ array[2]);
    }

    // we use bubble sort for this
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // let do with second approach
    // in this approach we first find out the largest element and the smallest element
    // after that iterate one more time to find out the second largest and second smallest element
    // this is a better approach as compare to the first one

    public static void secondLargestApproach2(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        // now we have to find the second largest element
        int secondLargest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest= arr[i];
            }
            if(arr[i] < secondSmallest && arr[i]!=secondSmallest){
                secondSmallest= arr[i];
            }
            System.out.println("Second largest  :- "+ secondLargest);
            System.out.println("Second Smallest  :- "+ secondSmallest);
        }
    }


}
