package participants;

import actions.Jump;
import actions.Participant;
import actions.RunAway;

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

    public Human(String name, double canJump, double canRun) {
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }


    @Override
    public double jumpOver() {
        System.out.printf("Человек %s прыгнул на высоту %d%n", name, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("Человек %s пробежал %d%n", name, canRun);
        return canRun;
    }
}
