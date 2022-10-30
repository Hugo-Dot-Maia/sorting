import java.util.Arrays;

public abstract class BaseSort {
    public int [] sortedArray;
    public String [] sortedStringArray;
    public String algorithmName;
    public long tempoInicio = 0;
    public long tempoTranscorrido = 0;

    public void sort(int[] arr){
        sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
    }
    public void sortStrings(String[] strings){
        sortedStringArray = Arrays.copyOf(strings, strings.length);
        Arrays.sort(sortedStringArray);
    }
    public void printArray(){
        System.out.print(algorithmName + ": ");
        for (int sortedNumber : sortedArray) {
            System.out.print(sortedNumber + " ");
        }
    }
    public void printStringArray(){
        System.out.print("\n" + algorithmName + ": ");
        for (String sortedString : sortedStringArray) {
            System.out.print(sortedString + "; ");
        }
    }

    public abstract void sorting(String[] array, int start, int end);
}
