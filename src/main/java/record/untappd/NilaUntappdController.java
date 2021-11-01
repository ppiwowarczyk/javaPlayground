package record.untappd;

import javaAnotation.Java10_var;
import javaAnotation.Java11_varInLambda;
import record.untappd.api.CheckInApi;
import record.untappd.api.CheckInDetails;
import record.untappd.api.User;

@Java10_var
@Java11_varInLambda
public class NilaUntappdController {

    private CheckInApi checkInApi;

    public NilaUntappdController(CheckInApi checkInApi)
    {
        this.checkInApi = checkInApi;
    }

    public UserStats getUserStats(User user)
    {
        var stats = checkInApi.getUserCheckIns(user)
                .stream()
                .map(CheckInDetails::getBeerDetail)
                .map((var x) -> x.abv())
                //.map(BeerDetail::abv)
                .mapToDouble(Double::doubleValue)
                .average().orElse(0);

        return new UserStats(stats);

    }
}
