package instance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Forward extends Player implements TeamMember
{
    public Forward(int goals, int assists) {
        super(goals, assists);
    }
}
