package когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.obstacle;

import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Person;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int name) {
        this.height = name;
    }

    @Override
    public boolean passObstacleBy(Person person) {
        if (person.jumpHeight() >= this.height){
            System.out.printf("Участник %s смог перепрыгнуть через стену высотой %d%n",person,this.height);
            return true;
        }else{
            System.out.printf("Участник %s не смогу перепрыгнуть через стену высоой %d%n",person,this.height);
            return false;
        }
    }
}
