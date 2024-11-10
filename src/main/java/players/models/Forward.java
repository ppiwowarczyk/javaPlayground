package players.models;

import javaAnotation.Java22_ConstructorStatementBeforeSuper;
import lombok.Getter;
import lombok.Setter;

@Java22_ConstructorStatementBeforeSuper
@Getter
@Setter
public final class Forward extends Player implements TeamMember
{
    public Forward(int goals, int assists) {
        validateStats(goals, assists);
        super(goals, assists);
    }

    public static void validateStats(int goals, int assists) {
        if (goals < 0) {
            throw new RuntimeException("Stats of goals can not be negative");
        }
        if (assists < 0) {
            throw new RuntimeException("Stats of goals can not be negative");
        }
    }
}
