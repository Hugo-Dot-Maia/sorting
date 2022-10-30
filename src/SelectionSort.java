import java.util.Arrays;

public class SelectionSort extends BaseSort {

    public SelectionSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    @Override
    public void sort(int[] arr) {
        tempoInicio = System.currentTimeMillis();

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

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    @Override
    public void sortStrings( String[] array )
    {
        sortedStringArray = Arrays.copyOf(array, array.length);
        for ( int j=0; j < sortedStringArray.length-1; j++ )
        {
            int min = j;
            for ( int k=j+1; k < sortedStringArray.length; k++ )
                if ( sortedStringArray[k].compareTo( sortedStringArray[min] ) < 0 ) min = k;

            String temp = sortedStringArray[j];
            sortedStringArray[j] = sortedStringArray[min];
            sortedStringArray[min] = temp;
        }

    }

    @Override
    public void sorting(String[] array, int start, int end) {

    }
}
