import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{20,-15,7,35,1,-22,55};
        int temp;
        for (int i = array.length-1; i >0; i--) {// here i can be understood as lastUnsortedIndex
            for (int j = 0; j < i ; j++) {
               if(array[j]==array[j+1]){
                   return;
               }
               else if  (array[j] > array[j + 1]){
                   temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
               }


               }
        }
        System.out.println(Arrays.toString(array));
    }
}

/* Here we are sorting in ascending order.
It is a stable sort algo.
1)in place algorithm - we are logically partitioning the array {the extra memory we used doesn't
 depend on the number of items we are sorting}
2)O(n^2) time complexity - quadratic {here the inner loop is doing the less work so it a general idea}
3)it will take 100 steps to sort 10 items 10,000 steps to sort 100 items
4)Algorithm degrades quickly.
 */
//for time complexity look for loops in the code

/* Stable Sort V/s Unstable Sort  --->
Stable and Unstable Comes into play when we have the duplicate values
In the sorted array whether the original positioning is preserved or not ?
In Unstable Sort the relative positioning is not preserved while in stable relative positioning is preserved
Stable sort are preferred over unstable sort for integers id=t doesn;t matter but for objects it's matter
*/
