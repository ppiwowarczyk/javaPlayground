package instance;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FootballStatsImplTest {

    @Test
    public void shouldGetCleanSheetsForGoalKeeper() {
        // given
        List<Player> players = List.of(
                new Forward(1,1),
                new GoalKeeper(0,0,2, 78),
                new GoalKeeper(0,0,1, 11)
        );

        // when
        var footballStatsImpl = new FootballStatsImpl();
        var result = footballStatsImpl.getNumberOfCleanSheets(players);

        // then
        assertThat(result).isNotNull();
        assertThat(result.getCleanSheets()).isEqualTo(3);
    }

    @Test
    public void shouldGetKeyStatOfPlayerWithDescriptionAndStatsValue()
    {
        // given
        var goals = 11;
        var cleanSheets = 2;

        Forward forward = new Forward(goals, 1);
        GoalKeeper goalKeeper = new GoalKeeper(0, 0, cleanSheets, 12);

        // when
        var footballStatsImpl = new FootballStatsImpl();
        var forwardResult = footballStatsImpl.getKeyStatOfPlayer(forward);
        var goalKeeperResult = footballStatsImpl.getKeyStatOfPlayer(goalKeeper);

        // then
        assertThat(forwardResult).isNotNull();
        assertThat(forwardResult.keyStateName()).isEqualTo("goals");
        assertThat(forwardResult.statValue()).isEqualTo(goals);

        assertThat(goalKeeperResult).isNotNull();
        assertThat(goalKeeperResult.keyStateName()).isEqualTo("clean sheets");
        assertThat(goalKeeperResult.statValue()).isEqualTo(cleanSheets);
    }
}