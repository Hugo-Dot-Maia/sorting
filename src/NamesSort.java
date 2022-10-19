import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class NamesSort
{
    public static List<String> readWordsFromFile(){
        var charset = StandardCharsets.UTF_8;
        var filePath = "src/nomes.txt";
        try {
            return Files.readAllLines(Path.of(filePath), charset);
        } catch (IOException e) {
            System.out.println("File Not Found");
            return null;
        }
    }
    public static void main(String[] args){
        var names = readWordsFromFile();

        if(!Objects.isNull(names)){
            names.forEach(System.out::println);
        }

    }
}
