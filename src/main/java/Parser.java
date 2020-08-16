import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files;
import java.util.Map.Entry;

public class Parser{
       public static void main (String[] args) throws Exception{
           List<String> lines;
           System.out.println("Digite o diretório onde se econtra o arquivo games.log: ");
           final String direc = new Scanner(System.in).next();
           try {
               lines= Files.readAllLines(Paths.get(direc));
               ParseGame game = new ParseGame(lines);
               List<Game> games = game.ParseGames();
               printGames(games);
       }
           catch (IOException e){
               System.out.println("Erro");
               throw new Exception (e.getMessage());
           }
       }

       public static void printGames(List<Game> games){
           System.out.println("Ranking: {");
           Map<String, Integer> totalkillsplayer = new HashMap<>();
           List<Player> players = new ArrayList<>();
           for (Game game : games){
               for(Player p : game.getPlayers()){
                   players.add(p);
               }
           }

           for (Player p : players){
               String name = p.getName();
               Integer killsgame = p.getKd().getValidKills();
               if(!totalkillsplayer.containsKey(name)){
                   totalkillsplayer.put(name, 0);
               }
               totalkillsplayer.put(name, totalkillsplayer.get(name) + killsgame);
           }

           for (Entry<String, Integer> Player : totalkillsplayer.entrySet()) {
               System.out.println(" " + Player.getKey() + ": " + Player.getValue());
           }
           System.out.println("}");
           System.out.println("");

           for (Game game : games){
               System.out.println(game.getGamename()+" {");
               int totalkills = 0;
               for(Player player: game.getPlayers()){
                  totalkills = totalkills + player.getKd().getTotalDeaths();
               }
               System.out.println("Total Kills: "+ totalkills);
               System.out.print("players: [");
               for (Player player: game.getPlayers()){
                   System.out.print("'" + player.getName() + "', ");
               }
               System.out.print("]");
               System.out.println("");
               System.out.println("Kills:{ ");
               for (Player player: game.getPlayers()){
                   System.out.println(player.getName()+" : "+player.getKd().getValidKills());
               }
               System.out.println(" }");
               System.out.println("}");
           }

       }


}
