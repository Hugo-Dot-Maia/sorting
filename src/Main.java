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
            //baseSort.printArray();
        });
    }


    public static void main(String[] args) {

        var baseSortList = AlgorithmUtils.initializeAlgorithmList();

        var unsortedNumbers = initializeUnsortedNumbers();

        //System.out.print("Itens sem ordem: ");
        //Arrays.stream(unsortedNumbers).forEach(value -> System.out.print(value + " "));

        baseSortList.forEach(baseSort -> baseSort.sort(unsortedNumbers));


        printResult(baseSortList);

    }
}