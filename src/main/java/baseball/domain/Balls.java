package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import baseball.utils.BallStatus;
import baseball.utils.Result;

public class Balls {

    private final List<Ball> balls;
    private static final int LENGTH = 3;

    public Balls(List<Integer> numbers) {
        balls = mapToBalls(numbers);
    }

    private static List<Ball> mapToBalls(List<Integer> userNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (int index = 0; index < LENGTH; index++) {
            balls.add(new Ball(index, userNumbers.get(index)));
        }

        return balls;
    }

    public BallStatus compare(Ball userBall) {
        return balls.stream()
                .map(ball -> ball.compare(userBall))
                // .filter(status -> status != BallStatus.NOTHING)
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public Result compare(List<Integer> userNumbers) {
        List<Ball> userBalls = mapToBalls(userNumbers);
        Result result = new Result();

        for (int index = 0; index < LENGTH; index++) {
            result.setResult(this.compare(userBalls.get(index)));
        }
        return result;
    }

}