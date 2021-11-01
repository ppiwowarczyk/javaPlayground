package record.untappd.api;

import javaAnotation.Java9_PrivateMethodInDefaultInterface;

import java.util.List;

@Java9_PrivateMethodInDefaultInterface
public interface CheckInApi
{
    String sendCheckIn(CheckInDetails checkInDetails);

    List<CheckInDetails> getUserCheckIns(User user);

    default String version()
    {
        return provideVersionInternalMethodExample();
    }

    private String provideVersionInternalMethodExample()
    {
        return "v1";
    }
}
