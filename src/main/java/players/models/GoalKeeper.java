package players.models;

import javaAnotation.Java22_ConstructorStatementBeforeSuper;
import lombok.Getter;
import lombok.Setter;

@Java22_ConstructorStatementBeforeSuper
@Getter
@Setter
public final class GoalKeeper extends Player implements TeamMember {

    private int cleanSheets;
    private int saves;

    public GoalKeeper(int goals, int assists, int cleanSheets, int saves) {
        validateStats(goals, assists, cleanSheets, saves);
        super(goals, assists);
        this.cleanSheets = cleanSheets;
        this.saves = saves;
    }

    public static void validateStats(int goals, int assists, int cleanSheets, int saves) {
        if (goals < 0) {
            throw new RuntimeException("Stats of goals can not be negative");
        }
        if (assists < 0) {
            throw new RuntimeException("Stats of goals can not be negative");
        }
        if (cleanSheets < 0) {
            throw new RuntimeException("Stats of goals can not be negative");
        }
        if (saves < 0) {
            throw new RuntimeException("Stats of goals can not be negative");
        }
    }
}
