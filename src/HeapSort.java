import java.util.Arrays;

public class HeapSort extends BaseSort {
    public HeapSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }
    @Override
    public void sort(int[] arr)
    {
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        int N = sortedArray.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(sortedArray, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = sortedArray[0];
            sortedArray[0] = sortedArray[i];
            sortedArray[i] = temp;

            heapify(sortedArray, i, 0);
        }

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    void heapify(int[] arr, int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }
}
