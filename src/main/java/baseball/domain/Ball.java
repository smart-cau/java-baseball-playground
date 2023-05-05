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
        if (equals(userBall)) {
            return BallStatus.STRIKE;
        }

        if (isBall(userBall)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isBall(Ball userBall) {
        return this.index != userBall.index && this.number == userBall.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;
        return this.index == ball.index && this.number == ball.number;
    }
}
