package baseball.utils;

// enum은 jvm 내에서 하나만 존재하는 instance임. enum 또한 class이다
/*
enum 내에 있는 method들은 enum 자체가 유일하기 때문에 static이 없어도 static 처럼 기능하지만
vs code에선 그럼 사용하는 쪽에서 complie error 뜸. intellij에서는 안뜨는 것 같음
*/ 
public enum BallStatus {
    BALL, STRIKE, NOTHING;

    public static boolean isBall(BallStatus ballStatus) {
        return ballStatus == BALL;
    }

    public static boolean isStrike(BallStatus ballStatus) {
        return ballStatus == STRIKE;
    }

    public static boolean isNotNothing(BallStatus ballStatus) {
        return ballStatus != NOTHING;
    }
}
