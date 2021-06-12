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
            System.out.printf("%nУчастник %s успешно пробежал дистанцию%n", participant);
            return true;
        } else {
            System.out.printf("%nУчастник %s не смог пробежать дистанцию%n", participant);
            return false;
        }
    }
}
