package competitor;

public abstract class Participant implements Competitor {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    private boolean isDisqualified;

    //Способ проверки действий зависит от типа препятствия
    void overcomeObstacle(Obstacles obstacles) {
        if (obstacles instanceof Treadmill) {
            this.run(obstacles);
        } else if (obstacles instanceof Wall) {
            this.jump(obstacles);
        }
    }

    //Метод с действиями для успешных и неудачных запусков
    @Override
    public void run(Obstacles obstacles) {
        if (obstacles.overcome(maxRunDistance)) {
            isDisqualified = false;
            System.out.println(getClass().getSimpleName() + " " + name
                    + " пройденная беговая дорожка на расстоянии "
                    + obstacles.getObstaclesOutput());
        } else {
            isDisqualified = true;
            System.out.println(getClass().getSimpleName() + " "
                    + name + " не прошел беговую дорожку "
                    + "с расстоянием "
                    + obstacles.getObstaclesOutput()
                    + "прошел " + maxRunDistance
                    + ((maxRunDistance == 1) ? " метра." : " метров. ")
                    + name + " дисквалифицирован.");
        }
    }

    //Метод с действиями для успешных и неудачных переходов
    @Override
    public void jump(Obstacles obstacles) {
        if (obstacles.overcome(maxJumpHeight)) {
            isDisqualified = false;
            System.out.println(getClass().getSimpleName() + " " + name + " перепрыгнул "
                    + maxJumpHeight
                    + ((maxJumpHeight == 1) ? " метра " : " метров ") + "над стеной "
                    + obstacles.getObstaclesOutput());
        } else {
            isDisqualified = true;
            System.out.println(getClass().getSimpleName() + " " + name
                    + " не прошел стену " + "с высотой "
                    + obstacles.getObstaclesOutput()
                    + "перепрыгнул " + maxJumpHeight
                    + ((maxJumpHeight == 1) ? " метра." : " метров. ")
                    + name + " дисквалифицирован.");
        }
    }

    public boolean getIsDisqualified() {
        return isDisqualified;
    }
}


