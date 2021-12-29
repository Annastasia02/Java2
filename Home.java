package когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2;

import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Cat;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Human;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Person;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Robot;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.obstacle.Obstacle;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.obstacle.Track;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.obstacle.Wall;

import java.util.List;
import java.util.Random;

public class Home {
    public static void main(String[] args) {
        System.out.println("Первый этап");
        Competition competition = createAndCompetition();

        System.out.println("Старт соревнований");
        competition.startCompetition();

      List<Person> lastWinners = competition.getLastWinners();
      if (!lastWinners.isEmpty()){
          System.out.println("Выйграли жизнь: ");
              for (Person lastWinner : lastWinners) {
                  System.out.println(lastWinner);
              }
          }else{
              System.out.println("Все проиграли");
          }
      }
    private static Competition createAndCompetition(){
        Person human = new Human("Катя",250,5);
        Person cat = new Cat("Плюшка",150,10);
        Person robot = new Robot("Лаг",850,15);

        Random random = new Random();

        Obstacle Wall = new Wall (random.nextInt(200));
        Obstacle Track = new Track (random.nextInt(10));

        Competition competition = new Competition("Игра на выживание");
        competition.setObstacles(Wall,Track);
        competition.setPersons(human,cat,robot);
        return competition;

    }
}
