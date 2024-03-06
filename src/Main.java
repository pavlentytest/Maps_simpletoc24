import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Маps - словари, карты, ассоц. массив

        HashMap<String,String> cities = new HashMap<>();
        cities.put("msk","Moscow");
        cities.put("kzn","Kazan");
        cities.put("spb","Saint Petersburg");
        cities.put("oms","Omsk");
        cities.put("nsk","Novosibirsk");
        for(Map.Entry<String,String> m: cities.entrySet()) {
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        class Game {
            public String genre;
            public int year;

            public Game(String genre, int year) {
                this.genre = genre;
                this.year = year;
            }
        }
        TreeMap<String,Game> games = new TreeMap<>();
        games.put("nfs",new Game("simul",2000));
        games.put("amongus", new Game("simul",2010));
        games.put("cs",new Game("shooter",2000));
        games.put("skyrim",new Game("rpg",2011));
        for(Map.Entry<String,Game> m: games.entrySet()) {
            System.out.println(m.getKey() + "-" + m.getValue().year +", "+m.getValue().genre);
        }
    }
}