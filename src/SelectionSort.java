import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = new int[]{20,-15,7,35,1,-22,55};
        for (int i = array.length-1; i >0 ; i--) { // i = lastUnsortedIndex
           int largest = 0;
            for (int j = 1; j <=i; j++) {
                if  (array[j] > array[largest]){
                    largest = j;
                }
            }
            swap(array,largest,i);


        }

        System.out.println(Arrays.toString(array));
    }
    public static  void swap(int[] arr ,int i ,int j){
     if(i==j){
         return;
     }
     int temp = arr[i];
     arr[i]= arr[j];
     arr[j]= temp;
    }


}
/*
 * In place algorithm
 * O(n^2) time complexity - quadratic
 * Does't require as much swapping as bubble sort  we only swap once per traversal selectionm sort performs better than bubble sort
 * Unstable Algorithm
 */
