package record.untappd;

import javaAnotation.Java10_var;
import org.junit.Test;
import record.untappd.api.BeerDetail;
import record.untappd.api.CheckInDetails;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Java10_var
public class NilaCheckInApiTest {

    @Test
    public void shouldCheckIn() {

        // given
        var beerDetail = new BeerDetail("PanIPani", 7.1);
        var checkInDetail = new CheckInDetails(beerDetail, 4.4);

        // when
        var checkInApi = new MockedCheckInApi();
        var result= checkInApi.sendCheckIn(checkInDetail);

        // then
        assertThat(result).contains(beerDetail.name());
        assertThat(result).contains(checkInDetail.getScore().toString());
    }

    @Test
    public void shouldProvideVersion()
    {
        // given
        // when
        var checkInApi = new MockedCheckInApi();
        var version = checkInApi.version();

        // then
        assertThat(version).isEqualTo("v1");

    }
}
