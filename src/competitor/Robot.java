package competitor;

public class Robot extends Participant implements Competitor {

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super.name = name;
        super.maxRunDistance = maxRunDistance;
        super.maxJumpHeight = maxJumpHeight;
    }
}
