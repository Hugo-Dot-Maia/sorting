import java.util.*;

public class Main {

    private static int[] initializeUnsortedNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de números a se ordenar: ");
        int numberQuantity = sc.nextInt();

        Random rand = new Random();
        int upperbound = 100000;

        int[] unsortedNumbers = new int[numberQuantity] ;

        for (int i = 0; i < numberQuantity; i++) {
            unsortedNumbers[i] = rand.nextInt(upperbound);
        }
        return unsortedNumbers;
    }

    private static void printResult(List<BaseSort> baseSortList){
        baseSortList.forEach( baseSort -> {
            System.out.println(
                    "\nTempo decorrido para "
                            + baseSort.algorithmName
                            + " foi de: "
                            + baseSort.tempoTranscorrido);
           // baseSort.printArray();
        });
    }
    public static void main(String[] args) {
        var bubbleSort = new BubbleSort("Bubble Sort");
        var selectionSort = new SelectionSort("Selection Sort");
        var insertionSort = new InsertionSort("Insertion Sort");
        var heapSort = new HeapSort("Heap Sort");
        var mergeSort = new MergeSort("Merge Sort");
        var quickSort = new QuickSort("Quick Sort");
        var countingSort = new CountingSort("Counting Sort");
        var baseSortList = new ArrayList<BaseSort>();

        var unsortedNumbers = initializeUnsortedNumbers();

        //System.out.print("Itens sem ordem: ");
        //Arrays.stream(unsortedNumbers).forEach(value -> System.out.print(value + " "));

        bubbleSort.sort(unsortedNumbers);
        selectionSort.sort(unsortedNumbers);
        insertionSort.sort(unsortedNumbers);
        heapSort.sort(unsortedNumbers);
        mergeSort.sort(unsortedNumbers, 0, unsortedNumbers.length - 1);
        quickSort.sort(unsortedNumbers, 0, unsortedNumbers.length - 1);
        countingSort.sort(unsortedNumbers);

        baseSortList.add(bubbleSort);
        baseSortList.add(selectionSort);
        baseSortList.add(insertionSort);
        baseSortList.add(heapSort);
        baseSortList.add(mergeSort);
        baseSortList.add(quickSort);
        baseSortList.add(countingSort);
        printResult(baseSortList);

    }
}