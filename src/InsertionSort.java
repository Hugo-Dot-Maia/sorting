import java.util.Arrays;

public class InsertionSort extends BaseSort {
    public InsertionSort( String algorithmName) {
        this.algorithmName = algorithmName;
    }

    @Override
    public void sort(int[] arr) {
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        int n = sortedArray.length;
        for (int i = 1; i < n; i++) {
            int key = sortedArray[i];
            int j = i - 1;

            while (j >= 0 && sortedArray[j] > key) {
                sortedArray[j + 1] = sortedArray[j];
                j = j - 1;
            }
            sortedArray[j + 1] = key;
        }

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }
    @Override
    public void sortStrings (String[] array){
        sortedStringArray = Arrays.copyOf(array, array.length);

        int n = sortedStringArray.length;

        for (int i=1; i<n; i++){
            String key = sortedStringArray[i];
            int j = i-1;

            while (j >= 0 && sortedStringArray[j].compareToIgnoreCase(key)>0){
                sortedStringArray[j+1] = sortedStringArray[j];
                j=j-1;
            }
            sortedStringArray[j+1] = key;
        }
    }



}
