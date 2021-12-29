package когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2;

import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.Person.Person;
import когдаЗавалилаВесьКодИначалаЗановоМолодец_урок_1_2.obstacle.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private Person[] persons;
    private Obstacle[] obstacles;
    private final String competitionLaw;

    private final List<Person> lastWinners = new ArrayList<>();

    public Competition(String competitionLaw) {
        this.competitionLaw = competitionLaw;
    }

    public void setObstacles(Obstacle ...obstacles) {
        this.obstacles = obstacles;
    }

    public void setPersons(Person ...persons) {
        this.persons = persons;
    }

    public List<Person> getLastWinners() {
        return lastWinners;
    }
    public void startCompetition(){
        System.out.printf("Старт %s%n",this.competitionLaw);
        this.lastWinners.clear();

        for (Person person : this.persons){
           boolean success = this.passAllObstacles(person);
               if (!success){
                   System.out.printf("Участник %s выбыл %%n",person);
            }else{
                   this.lastWinners.add(person);
               }
        }
    }
    private boolean passAllObstacles(Person person){
        for (Obstacle obstacle : this.obstacles){
            if (!obstacle.passObstacleBy(person)){
              return false;
            }
        }
        return true;
    }
}
