package obstacles;

import actions.Obstacle;
import actions.Participant;

public class Treadmill implements Obstacle {
    double isLong;

    public double getIsLong() {
        return isLong;
    }

    public Treadmill(double isLong) {
        this.isLong = isLong;
    }

    @Override
    public boolean overcoming(Participant participant) {
        if (participant.ran()>= isLong) {
            System.out.printf("Участник %s успешно пробежал дистанцию", participant);
            return true;
        } else {
            System.out.printf("Участник %s не смог пробежать дистанцию", participant);
            return false;
        }
    }
}
