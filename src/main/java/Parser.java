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
               ParseGame game = new ParseGame(lines);
               List<Game> games = game.ParseGames();
               for (Game g:games){
                   System.out.println(g.getGamename());
                   List<Player> players = g.getPlayers();
                   for (Player p : players){
                       System.out.println(p.getName() + " "+ p.getKd().getValidKills());
                   }
               }
           }
           catch (IOException e){
               System.out.println("Erro");
               throw new Exception (e.getMessage());
           }
       }

}
