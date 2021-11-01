package record.untappd;

import org.apache.log4j.Logger;
import record.untappd.api.BeerDetail;
import record.untappd.api.CheckInApi;
import record.untappd.api.CheckInDetails;
import record.untappd.api.User;

import java.util.List;

public class MockedCheckInApi implements CheckInApi
{
    private static final Logger logger = Logger.getLogger("NilaCheckInApi");

    @Override
    public String sendCheckIn(CheckInDetails checkInDetails)
    {
        return checkInDetails.getScore()+"-"+checkInDetails.getBeerDetail().name();
    }

    @Override
    public List<CheckInDetails> getUserCheckIns(User user)
    {
        return List.of(
            new CheckInDetails(
                    new BeerDetail("PanIPani", 6.0), 3.9
            ),
            new CheckInDetails(
                    new BeerDetail("Samiec Alfa", 6.2), 4.2
            )
        );
    }
}
