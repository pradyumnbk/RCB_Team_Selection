import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {

    public static boolean countForeignPlayers(ArrayList<Player> players){
        List<Player> foreignPlayer=players.stream().filter(e->!e.getCountry().equalsIgnoreCase("india")).collect(Collectors.toList());
        return foreignPlayer.size()==4;
    }
    public static boolean countWicketPlayer(ArrayList<Player> players){
        long count=players.stream().filter(e->e.getRole().equalsIgnoreCase("Wicket-keeper")).count();
        return count==1;
    }
}
