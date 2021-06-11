import actions.Participant;
import holdingСompetitions.Competition;
import obstacles.Treadmill;
import obstacles.Wall;
import participants.Cat;
import participants.Human;
import participants.Robot;

import java.util.Random;

public class Main {
    private static Competition creatingCompetition(){
        Participant cat = new Cat("Baris", 1.5, 100);
        Participant human = new Human("Jon",1000, 1);
        Participant robot = new Robot("JS123", 500,1.9);

        Random rnd = new Random();

        Treadmill treadmill = new Treadmill(300);
        Wall wall = new Wall(1.1);

        Competition competition = new Competition("Веселые старты");
        competition.setParticipants(cat, human, robot);
        competition.setObstacles(treadmill, wall);
        return competition;
    }
    public static void main(String[] args) {
        System.out.println("Подготовка....");
        Competition competition = creatingCompetition();
        System.out.println("Начинаем соревнования!!!");
        competition.startCompetition();

        System.out.println("Соревнование окончено наши победители: ");
        for (Participant winner: competition.getWinners()){
            System.out.println(winner);
        }
    }
}
