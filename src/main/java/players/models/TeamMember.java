package players.models;

import javaAnotation.Java15_SealedClasses;

@Java15_SealedClasses
public sealed interface TeamMember permits Forward, GoalKeeper {
}
