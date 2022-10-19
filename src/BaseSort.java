import java.util.Arrays;

public abstract class BaseSort {
    public int [] sortedArray;
    public String algorithmName;
    public long tempoInicio = 0;
    public long tempoTranscorrido = 0;

    public void sort(int[] arr){
        sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
    }
    public void printArray(){
        System.out.print(algorithmName + ": ");
        for (int sortedNumber : sortedArray) {
            System.out.print(sortedNumber + " ");
        }
    }
}
