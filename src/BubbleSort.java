import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr) {

        int [] bubbleArray = Arrays.copyOf(arr, arr.length);
        int n = bubbleArray.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (bubbleArray[j - 1] > bubbleArray[j]) {
                    //swap elements
                    temp = bubbleArray[j - 1];
                    bubbleArray[j - 1] = bubbleArray[j];
                    bubbleArray[j] = temp;
                }

            }
        }

        System.out.print("Bubble Sort: ");
        for (int sortedNumber : bubbleArray) {
            System.out.print(sortedNumber + " ");
        }
    }
}
