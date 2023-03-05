package competitor;

public class Human extends Participant implements Competitor {

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super.name = name;
        super.maxRunDistance = maxRunDistance;
        super.maxJumpHeight = maxJumpHeight;
    }
}
