package participants;

import actions.Participant;

import java.util.StringJoiner;

public class Cat implements Participant {
    String nickname;
    double canJump, canRun;

    public Cat(String nickname, double canJump, double canRun) {
        this.nickname = nickname;
        this.canJump = canJump;
        this.canRun = canRun;
    }


    @Override
    public double jumpOver() {
        System.out.printf("Кот %s прыгнул на высоту %d%n", nickname, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("Кот %s пробежал %d%n", nickname, canRun);
        return canRun;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("nickname='" + nickname + "'")
                .add("canJump=" + canJump)
                .add("canRun=" + canRun)
                .toString();
    }
}
