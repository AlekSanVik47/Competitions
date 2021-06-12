package participants;

import actions.Participant;

import java.util.StringJoiner;

public class Cat implements Participant {
    private final String nickname;
    private final double canJump, canRun;

    public Cat(String nickname, double canRun, double canJump) {
        this.nickname = nickname;
        this.canJump = canJump;
        this.canRun = canRun;
    }



    @Override
    public double jumpOver() {
        System.out.printf("%nКот %s прыгнул на высоту %.2f%n", nickname, canJump);
        return canJump;
    }

    @Override
    public double ran() {
        System.out.printf("%nКот %s пробежал %.2f%n", nickname, canRun);
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
