import java.util.Arrays;

public class QuickSort extends BaseSort{
    public QuickSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }
    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    @Override
    public void sort(int[] arr){
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        quickSort(sortedArray,0, sortedArray.length - 1);

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

}
