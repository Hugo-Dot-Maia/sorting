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
    public static void main(String[] args) {
        var bubbleSort = new BubbleSort();
        var selectionSort = new SelectionSort();
        var insertionSort = new InsertionSort();

        var unsortedNumbers = initializeUnsortedNumbers();

        System.out.print("Itens sem ordem: ");
        for (int unsortedNumber : unsortedNumbers) {
            System.out.print(unsortedNumber + " ");
        }
        System.out.println("");

        bubbleSort.sort(unsortedNumbers);
        System.out.println("");
        selectionSort.sort(unsortedNumbers);
        System.out.println("");
        insertionSort.sort(unsortedNumbers);

    }
}