package competitor;

public class Wall implements Obstacles {
    private final int heightOfWall;

    public Wall(int heightOfWall) {
        this.heightOfWall = heightOfWall;
    }

    @Override
    public boolean overcome(int maxJumpHeight) {
        return maxJumpHeight > heightOfWall;
    }

    public String getObstaclesOutput() {
        return heightOfWall + ((heightOfWall == 1) ? " метра " : " метров ") + "высота.";
    }
}
