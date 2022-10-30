import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class NamesSort {
    public static List<String> readNamesFromFile(){
        var charset = StandardCharsets.UTF_8;
        var filePath = "src/nomes.txt";
        try {
            return Files.readAllLines(Path.of(filePath), charset);
        } catch (IOException e) {
            System.out.println("Arquivo nao encontrado");
            return Collections.emptyList();
        }
    }
    public static void main(String[] args){
        List<String> names = readNamesFromFile();
        String[] strings = new String[names.size()];

        List<BaseSort> baseSortList = AlgorithmUtils.initializeAlgorithmList();

        names.forEach(System.out::println);

        baseSortList.forEach(baseSort -> baseSort.sortStrings(names.toArray(strings)));
        baseSortList.forEach(BaseSort::printStringArray);
    }
}
