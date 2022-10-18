import java.util.Arrays;

public class InsertionSort {
    void sort(int[] arr) {
        int [] insertionArray = Arrays.copyOf(arr, arr.length);
        int n = insertionArray.length;
        for (int i = 1; i < n; ++i) {
            int key = insertionArray[i];
            int j = i - 1;

            while (j >= 0 && insertionArray[j] > key) {
                insertionArray[j + 1] = insertionArray[j];
                j = j - 1;
            }
            insertionArray[j + 1] = key;
        }

        System.out.print("Insertion Sort: ");
        for (int sortedNumber : insertionArray) {
            System.out.print(sortedNumber + " ");
        }
    }
}
