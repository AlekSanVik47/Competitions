package obstacles;

import actions.Obstacle;
import actions.Participant;

public class Wall implements Obstacle {
    double height;

    public double getHeight() {
        return height;
    }

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcoming(Participant participant) {
        if (participant.jumpOver()>= height) {
            System.out.printf("Участник %s успешно перепрыгнул стену", participant);
            return true;
        } else {
            System.out.printf("Участник %s не смог перепрыгнуть через стену", participant);
            return false;
        }
    }
}
