package когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.obstacle;

import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Person;

public class Track implements Obstacle{
    private final int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean passObstacleBy(Person person) {
        if (person.runDistance() >= this.distance) {
            System.out.printf("Участник %s смог пробежать дистанцию длинной в %d%n", person, this.distance);
            return true;
        } else {
            System.out.printf("Участник %s не справился с дистанцией %d%n", person, this.distance);
            return false;
        }
    }
}
