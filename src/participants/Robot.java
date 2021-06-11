package participants;

import actions.Jump;
import actions.Participant;
import actions.RunAway;

import java.util.StringJoiner;

public class Robot implements Participant {
    String serialNumber;
    double canJump, canRun;

    public Robot(String serialNumber, double canJump, double canRun) {
        this.serialNumber = serialNumber;
        this.canJump = canJump;
        this.canRun = canRun;
    }

    @Override
    public double jumpOver() {
        System.out.printf("Робот %s прыгнул на высоту %d%n", serialNumber, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("Робот %s пробежал %d%n", serialNumber, canRun);
        return canRun;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Robot.class.getSimpleName() + "[", "]")
                .add("serialNumber='" + serialNumber + "'")
                .add("canJump=" + canJump)
                .add("canRun=" + canRun)
                .toString();
    }
}
