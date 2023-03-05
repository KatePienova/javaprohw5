package competitor;

public class Cat extends Participant implements Competitor {

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super.name = name;
        super.maxRunDistance = maxRunDistance;
        super.maxJumpHeight = maxJumpHeight;
    }
}

