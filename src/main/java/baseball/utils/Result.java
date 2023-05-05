package baseball.utils;

public class Result {
    private int ballNo = 0;
    private int strikeNo = 0;

    public void setResult(BallStatus ballStatus) {
        if (BallStatus.isBall(ballStatus)) {
            ballNo++;
        }
        if (BallStatus.isStrike(ballStatus)) {
            strikeNo++;
        }
    }

    public int getBallNo() {
        return ballNo;
    }

    public int getStrikeNo() {
        return strikeNo;
    }

    public boolean isNothing() {
        return getBallNo() == 0 && getStrikeNo() == 0;
    }

    public boolean isGameEnd() {
        return strikeNo == 3;
    }
}
