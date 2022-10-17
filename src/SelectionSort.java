import java.util.Arrays;

public class SelectionSort {
    void sort(int[] arr) {

        int [] selectionArray = Arrays.copyOf(arr, arr.length);
        int n = selectionArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (selectionArray[j] < selectionArray[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = selectionArray[min_idx];
            selectionArray[min_idx] = selectionArray[i];
            selectionArray[i] = temp;
        }

        System.out.print("Selection Sort: ");
        for (int sortedNumber : selectionArray) {
            System.out.print(sortedNumber + " ");
        }

    }
}
