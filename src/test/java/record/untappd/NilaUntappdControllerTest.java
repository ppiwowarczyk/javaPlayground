package record.untappd;

import org.junit.Test;
import record.untappd.api.User;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class NilaUntappdControllerTest {

    @Test
    public void shouldCalculateAverageBeerAbvPerUser()
    {
        // given
        var user = new User("emhyr");

        // when
        var nilaUntappdController = new NilaUntappdController(new MockedCheckInApi());
        var results = nilaUntappdController.getUserStats(user);

        // then
        assertThat(results.averageBeerAbv()).isEqualTo(6.1);
    }
}