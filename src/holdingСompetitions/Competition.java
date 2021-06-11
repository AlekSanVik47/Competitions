package holdingСompetitions;

import actions.Obstacle;
import actions.Participant;

import java.util.LinkedList;
import java.util.List;

public class Competition {
   private Obstacle[] obstacles;
   private Participant[] participants;
   private final String competitionTitle;

   private List<Participant> winners = new LinkedList<>();

   public Competition(String competitionTitle) {
      this.competitionTitle = competitionTitle;
   }

   public void setObstacles(Obstacle[] obstacles) {
      this.obstacles = obstacles;
   }

   public void setParticipants(Participant[] participants) {
      this.participants = participants;
   }
    void startCompetition (){
       System.out.printf("Начало соревнований: %s", competitionTitle);
       winners.clear();
       for (Participant participant: participants) {
            boolean success = passAllObstacles(participant);
            if (!success){
               System.out.printf("Участник %s покинул соревнование", participant);
            }else {
               winners.add(participant);
            }
       }
    }
    private boolean passAllObstacles(Participant participant){
       for (Obstacle obstacle:obstacles) {
          if (!obstacle.overcoming(participant)){
             return false;
          }
          System.out.println();
       }
       return true;
    }

   public List <Participant> getWinners() {
      return winners;
   }
}
