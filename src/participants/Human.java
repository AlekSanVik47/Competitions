package participants;

import actions.Participant;

import java.util.StringJoiner;

public class Human implements Participant {
    String name;
    double canJump, canRun;

    @Override
    public String toString() {
        return new StringJoiner(", ", Human.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("canJump=" + canJump)
                .add("canRun=" + canRun)
                .toString();
    }

    public Human(String name, int jump, double canJump) {
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }


    @Override
    public double jumpOver() {
        System.out.printf("%nЧеловек %s прыгнул на высоту %f%n", name, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("%nЧеловек %s пробежал %f%n", name, canRun);
        return canRun;
    }
}
