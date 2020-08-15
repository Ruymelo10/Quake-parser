import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;
import java.util.Scanner;

public class Parser{
       public static void main (String[] args) throws Exception{
           List<String> lines;
           final String direc = new Scanner(System.in).next();
           try {
                lines= Files.readAllLines(Paths.get(direc));
           }
           catch (IOException e){
               System.out.println("Erro");
               throw new Exception (e.getMessage());
           }
       }

}
