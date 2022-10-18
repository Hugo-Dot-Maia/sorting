import java.util.Arrays;

public class SelectionSort {
    void sort(int[] arr) {

        int [] selectionArray = Arrays.copyOf(arr, arr.length);
        int n = selectionArray.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (selectionArray[j] < selectionArray[min_idx])
                    min_idx = j;

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
