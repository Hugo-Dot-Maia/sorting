import java.util.Arrays;

public class CountingSort extends BaseSort{
    public CountingSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }


    @Override
    public void sort(int[] arr) {
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        int max = Arrays.stream(sortedArray).max().getAsInt();
        int min = Arrays.stream(sortedArray).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[sortedArray.length];
        for (int j : sortedArray) {
            count[j - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = sortedArray.length - 1; i >= 0; i--) {
            output[count[sortedArray[i] - min] - 1] = sortedArray[i];
            count[sortedArray[i] - min]--;
        }

        System.arraycopy(output, 0, sortedArray, 0, sortedArray.length);

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    @Override
    public void sorting(String[] array, int start, int end) {

    }
}
