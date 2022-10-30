import java.util.*;

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

    @Override
    public void sorting(String[] array, int start, int end) {

        int i = start;
        int k = end;
        if (end - start >= 1) {
            String pivot = sortedStringArray[start];
            while (k > i) {
                while (sortedStringArray[i].compareTo(pivot) <= 0 && i <= end && k > i)
                    i++;
                while (sortedStringArray[k].compareTo(pivot) > 0 && k >= start && k >= i)
                    k--;
                if (k > i)
                    swap(sortedStringArray, i, k);
            }
            swap(sortedStringArray, start, k);
            sorting(sortedStringArray, start, k - 1);
            sorting(sortedStringArray, k + 1, end);
        }
        else {
            return;
        }
    }
    public void swap(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Override
    public void sortStrings(String[] strings){
        sortedStringArray = Arrays.copyOf(strings, strings.length);
        sorting(sortedStringArray,0,sortedStringArray.length-1);
    }
}
