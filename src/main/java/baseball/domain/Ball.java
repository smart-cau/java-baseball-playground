package baseball.domain;

import baseball.utils.BallStatus;
import baseball.utils.Validations;

public class Ball {
    private final int index;
    private final int number;

    public Ball(int index, int number) throws IllegalArgumentException {
        if (!Validations.ball(index, number)) {
            throw new IllegalArgumentException();
        }
        this.index = index;
        this.number = number;
    }

    public BallStatus compare(Ball userBall) {
        if (isStrike(userBall)) {
            return BallStatus.STRIKE;
        }

        if (isBall(userBall)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isStrike(Ball userBall) {
        return this.index == userBall.index && this.number == userBall.number;
    }

    private boolean isBall(Ball userBall) {
        return this.index != userBall.index && this.number == userBall.number;
    }
}
