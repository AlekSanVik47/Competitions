package participants;

import actions.Participant;

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
        System.out.printf("%nРобот %s прыгнул на высоту %.2f%n", serialNumber, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("%nРобот %s пробежал %.2f%n", serialNumber, canRun);
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
