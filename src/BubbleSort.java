import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{20,-15,7,35,1,-22,55};
        int temp;
        for (int i = array.length-1; i >0; i--) {// here i can be understood as lastUnsortedIndex
            for (int j = 0; j <i ; j++) {


            if(array[j]>array[j+1]){
                temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }

        }}
        System.out.println(Arrays.toString(array));
    }
}

/* Here we are sorting in ascending order.
1)in place algorithm - we are logically partitioning the array the extra memory we used doesn't
 depend on the number of items we are sorting
2)O(n^2) time complexity - quadratic {here the inner loop is doing the less work so it a general idea}
3)it will take 100 steps to sort 10 items 10,000 steps to sort 100 items
4)Algorithm degrades quickly.
 */
