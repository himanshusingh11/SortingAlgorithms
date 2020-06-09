import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 33, 4, 665, 4, 3, 0};
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && key < array[i]) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
Runtime Analysis depends upon:
1) T(n) = Runtime will be n input
2) Input Pattern --->>  a sorted will take less comparisons(less time) than
the reverse sorted array .

Time Complexity :
Worst Case : T(n) maximum time for any input of size n----> Always go for the worst case to explain any algo :
For Insertion Sort Worst Case is if the Input is Reverse Sorted.

Best Case : T(n) minimum time for any input of size n --> this is bogus
For Insertion Sort Best Case is if the Input is Sorted Array.Only one Comparison will take place

Average Case : T(n) average  time for any input of size n

 */
