import java.util.ArrayList;
import java.util.List;

public class AlgorithmUtils {
    public static List<BaseSort> initializeAlgorithmList(){
        var bubbleSort = new BubbleSort("Bubble Sort");
        var selectionSort = new SelectionSort("Selection Sort");
        var insertionSort = new InsertionSort("Insertion Sort");
        var heapSort = new HeapSort("Heap Sort");
        var mergeSort = new MergeSort("Merge Sort");
        var quickSort = new QuickSort("Quick Sort");
        var countingSort = new CountingSort("Counting Sort");

        var baseSortList = new ArrayList<BaseSort>();

        baseSortList.add(bubbleSort);
        baseSortList.add(selectionSort);
        baseSortList.add(insertionSort);
        baseSortList.add(heapSort);
        baseSortList.add(mergeSort);
        baseSortList.add(quickSort);
        baseSortList.add(countingSort);

        return baseSortList;

    }
}
