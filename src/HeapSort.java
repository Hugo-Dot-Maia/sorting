import java.util.Arrays;

public class HeapSort extends BaseSort {
    static int baseIndex = -1;
    static String[] heapStrings = new String[1000];
    public HeapSort(String algorithmName) {
        this.algorithmName = algorithmName;
    }
    @Override
    public void sort(int[] arr) {
        tempoInicio = System.currentTimeMillis();

        sortedArray = Arrays.copyOf(arr, arr.length);
        int n = sortedArray.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(sortedArray, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = sortedArray[0];
            sortedArray[0] = sortedArray[i];
            sortedArray[i] = temp;

            heapify(sortedArray, i, 0);
        }

        tempoTranscorrido = (long) ((System.currentTimeMillis() - tempoInicio) * 1000d);
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    @Override
    public void sortStrings (String[] names){
        sortedStringArray = Arrays.copyOf(names, names.length);

        //int n = sortedStringArray.length;

        for (String s : sortedStringArray) {
            heapForm(s);
        }

        heapSort();
    }

    @Override
    public void sorting(String[] array, int start, int end) {

    }

    static void heapForm(String k){
        baseIndex++;

        heapStrings[baseIndex] = k;

        int child = baseIndex;

        String tmp;

        int index = baseIndex/2;

        while (index >= 0){
            if (heapStrings[index].compareTo(heapStrings[child]) > 0){

                tmp = heapStrings[index];
                heapStrings[index] = heapStrings[child];
                heapStrings[child] = tmp;
                child = index;

                index = index/2;
            }
            else{
                break;
            }
        }
    }

    static void heapSort() {
        int left1, right1;

        while (baseIndex >= 0) {
            String k;
            k = heapStrings[0];

            System.out.print(k + " ");

            heapStrings[0] = heapStrings[baseIndex];

            baseIndex = baseIndex - 1;

            String tmp;

            int index = 0;

            int length = baseIndex;

            left1 = 1;

            right1 = left1 + 1;

            while (left1 <= length) {
                if (heapStrings[index].compareTo(heapStrings[left1]) <= 0 &&
                        heapStrings[index].compareTo(heapStrings[right1]) <= 0){
                    break;
                }
                else {
                    if (heapStrings[left1].compareTo(heapStrings[right1])< 0){
                        tmp = heapStrings[index];
                        heapStrings[index] = heapStrings[left1];
                        heapStrings[left1] = tmp;
                        index = left1;
                    }

                    else{
                        tmp = heapStrings[index];
                        heapStrings[index] = heapStrings[right1];
                        heapStrings[right1] = tmp;
                        index = right1;
                    }
                }
                left1 = 2 * left1;
                right1 = left1 + 1;
            }
        }
    }
}
