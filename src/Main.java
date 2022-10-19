import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static int[] initializeUnsortedNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de números a se ordenar: ");
        int numberQuantity = sc.nextInt();

        Random rand = new Random();
        int upperbound = 10000;

        int[] unsortedNumbers = new int[numberQuantity] ;

        for (int i = 0; i < numberQuantity; i++) {
            unsortedNumbers[i] = rand.nextInt(upperbound);
        }
        return unsortedNumbers;
    }

    private static void printResult(List<BaseSort> baseSortList){
        baseSortList.forEach(BaseSort::printArray);
    }
    public static void main(String[] args) {
        var bubbleSort = new BubbleSort("Bubble Sort");
        var selectionSort = new SelectionSort("Selection Sort");
        var insertionSort = new InsertionSort("Insertion Sort");
        var heapSort = new HeapSort("Heap Sort");
        var baseSortList = new ArrayList<BaseSort>();

        var unsortedNumbers = initializeUnsortedNumbers();

        System.out.print("Itens sem ordem: ");
        for (int unsortedNumber : unsortedNumbers) {
            System.out.print(unsortedNumber + " ");
        }

        bubbleSort.sort(unsortedNumbers);
        selectionSort.sort(unsortedNumbers);
        insertionSort.sort(unsortedNumbers);
        heapSort.sort(unsortedNumbers);

        baseSortList.add(bubbleSort);
        baseSortList.add(selectionSort);
        baseSortList.add(insertionSort);
        baseSortList.add(heapSort);
        printResult(baseSortList);

    }
}