import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var bubbleSort = new BubbleSort();

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de números a se ordenar: ");
        int numberQuantity = sc.nextInt();

        Random rand = new Random();
        int upperbound = 10000;

        int[] unsortedNumbers = new int[numberQuantity] ;

        for (int i = 0; i < numberQuantity; i++) {
            unsortedNumbers[i] = rand.nextInt(upperbound);
        }

        System.out.print("Itens sem ordem");
        for (int unsortedNumber : unsortedNumbers) {
            System.out.print(unsortedNumber + " ");
        }

        bubbleSort.sort(unsortedNumbers);

    }
}