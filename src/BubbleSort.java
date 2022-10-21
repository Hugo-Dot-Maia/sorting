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
                    //swap elements
                    temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }

            }
        }
        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    @Override
    public void sortStrings(String[] strings){
        sortedStringArray = Arrays.copyOf(strings, strings.length);
        int n = sortedStringArray.length;

        String temp;

        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (strings[j].compareTo(strings[i]) > 0)
                {
                    temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
            }
        }

    }
}
