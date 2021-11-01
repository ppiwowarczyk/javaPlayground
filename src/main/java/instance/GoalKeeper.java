package instance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class GoalKeeper extends Player implements TeamMember {

    private int cleanSheets;
    private int saves;

    public GoalKeeper(int goals, int assists, int cleanSheets, int saves) {
        super(goals, assists);
        this.cleanSheets = cleanSheets;
        this.saves = saves;
    }
}
