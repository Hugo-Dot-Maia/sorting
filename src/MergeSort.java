import java.util.Arrays;

public class MergeSort extends BaseSort{

    public MergeSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    void mergeSort(int[] arr, int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    @Override
    public void sort(int[] arr){
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        mergeSort(sortedArray,0, sortedArray.length - 1);

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    @Override
    public void sortStrings(String[] names){
        sortedStringArray = Arrays.copyOf(names, names.length);
        int n = sortedStringArray.length;

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (isAlphabeticallySmaller(
                        sortedStringArray[j], sortedStringArray[min_idx])) {
                    min_idx = j;
                }
            }
            String temp = sortedStringArray[min_idx];
            sortedStringArray[min_idx] = sortedStringArray[i];
            sortedStringArray[i] = temp;
        }
    }
    static boolean isAlphabeticallySmaller(String str1, String str2){
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        return str1.compareTo(str2) < 0;
    }
}
