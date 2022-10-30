import java.util.Arrays;

public class BubbleSort extends BaseSort{
    public BubbleSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    @Override
    public void sort(int[] arr) {
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        int n = sortedArray.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sortedArray[j - 1] > sortedArray[j]) {
                    temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }

            }
        }
        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    @Override
    public void sortStrings(String[] names) {
        sortedStringArray = Arrays.copyOf(names, names.length);
        String temp;
        for (int j = 0; j < sortedStringArray.length; j++) {
            for (int i = j + 1; i < sortedStringArray.length; i++) {
                if (sortedStringArray[i].compareTo(sortedStringArray[j]) < 0) {
                    temp = sortedStringArray[j];
                    sortedStringArray[j] = sortedStringArray[i];
                    sortedStringArray[i] = temp;
                }
            }
        }
    }

    @Override
    public void sorting(String[] array, int start, int end) {

    }
}
