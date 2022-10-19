import java.util.Arrays;

public class SelectionSort extends BaseSort {

    public SelectionSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    @Override
    public void sort(int[] arr) {

        sortedArray = Arrays.copyOf(arr, arr.length);
        int n = sortedArray.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (sortedArray[j] < sortedArray[min_idx])
                    min_idx = j;

            int temp = sortedArray[min_idx];
            sortedArray[min_idx] = sortedArray[i];
            sortedArray[i] = temp;
        }
    }
}
