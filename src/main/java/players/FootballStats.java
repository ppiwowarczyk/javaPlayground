package players;

import players.models.KeyPlayerStat;
import players.models.Player;

import java.util.List;

public interface FootballStats {

    PlayerStats getNumberOfCleanSheets(List<Player> playerList);

    KeyPlayerStat getKeyStatOfPlayer(Player player);

}
