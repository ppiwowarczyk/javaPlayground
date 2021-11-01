package players;

import javaAnotation.Java16_PatternMatching;
import javaAnotation.Java17_PatternMatchingSwitch;
import players.models.Forward;
import players.models.GoalKeeper;
import players.models.KeyPlayerStat;
import players.models.Player;

import java.util.List;

@Java16_PatternMatching
@Java17_PatternMatchingSwitch
public class FootballStatsImpl implements FootballStats {

    @Override
    public PlayerStats getNumberOfCleanSheets(List<Player> playerList) {

        final PlayerStats layerStats = new PlayerStats(0);

        playerList.stream().forEach(s -> {
            if (s instanceof GoalKeeper goalKeeper) {
                int currentCleanSheets = layerStats.getCleanSheets() + goalKeeper.getCleanSheets();
                layerStats.setCleanSheets(currentCleanSheets);
            }
        });

        return layerStats;
    }

    @Override
    public KeyPlayerStat getKeyStatOfPlayer(Player player) {

        return switch (player) {
            case Forward forward -> new KeyPlayerStat("goals", forward.getGoals());
            case GoalKeeper goalKeeper -> new KeyPlayerStat("clean sheets", goalKeeper.getCleanSheets());
            default -> throw new IllegalArgumentException("Unrecognized player and can not get key stats");
        };
    }
}
