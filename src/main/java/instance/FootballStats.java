package instance;

import java.util.List;

public interface FootballStats {

    PlayerStats getNumberOfCleanSheets(List<Player> playerList);

    KeyPlayerStat getKeyStatOfPlayer(Player player);

}
