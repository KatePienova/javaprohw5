package competitor;

public class Main {

    // основной логический метод прохождения всех препятствий каждым участником
    public static void passObstacles(Participant[] arrayOfCompetitors,
                                     Obstacles[] arrayOfObstacles) {
        for (Participant eachParticipant : arrayOfCompetitors)
            for (Obstacles arrayOfObstacle : arrayOfObstacles) {
                eachParticipant.overcomeObstacle(arrayOfObstacle);
                if (eachParticipant.getIsDisqualified()) {
                    break;
                }
            }
    }

    public static void main(String[] args) {
        Participant human = new Human("Игорь", 65, 2);
        Participant robot = new Robot("Р-01", 100, 7);
        Participant cat = new Cat("Мурка", 35, 1);
        Participant cat2 = new Cat("Белоснежка", 50, 3);
        Participant[] arrayOfCompetitors = new Participant[]{human, robot, cat, cat2};

        Obstacles treadmill = new Treadmill(75);
        Obstacles wall = new Wall(4);
        Obstacles treadmill2 = new Treadmill(39);
        Obstacles wall2 = new Wall(2);
        Obstacles[] arrayOfObstacles = new Obstacles[]{treadmill, wall, treadmill2, wall2};

        passObstacles(arrayOfCompetitors, arrayOfObstacles);
    }
}
