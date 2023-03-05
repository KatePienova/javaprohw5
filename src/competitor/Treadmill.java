package competitor;

public class Treadmill implements Obstacles {
    private final int lengthOfTreadmill;

    public Treadmill(int lengthOfTreadmill) {
        this.lengthOfTreadmill = lengthOfTreadmill;
    }

    @Override
    public boolean overcome(int maxRunDistance) {
        return maxRunDistance > lengthOfTreadmill;
    }

    public String getObstaclesOutput() {
        return lengthOfTreadmill + ((lengthOfTreadmill == 1) ? " метра." : " метров.");
    }
}