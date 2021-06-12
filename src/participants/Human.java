package participants;

import actions.Participant;

import java.util.StringJoiner;

public class Human implements Participant {
    private final String name;
    private final double canJump, canRun;

    @Override
    public String toString() {
        return new StringJoiner(", ", Human.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("canJump=" + canJump)
                .add("canRun=" + canRun)
                .toString();
    }

    public Human(String name, int canRun, double canJump) {
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }


    @Override
    public double jumpOver() {
        System.out.printf("%nЧеловек %s прыгнул на высоту %.2f%n", name, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("%nЧеловек %s пробежал %.2f%n", name, canRun);
        return canRun;
    }
}
