package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import baseball.utils.BallStatus;

public class BallTest {

    Ball comBall;

    @BeforeEach
    void setup() {
        comBall = new Ball(1, 1);
    }

    @Test
    @DisplayName("BallStatus == BALL")
    void ballTest() {
        Ball userBall = new Ball(2, 1);
        BallStatus ballStatus = comBall.compare(userBall);

        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("BallStatus == STRIKE")
    void strikeTest() {
        Ball userBall = new Ball(1, 1);
        BallStatus ballStatus = comBall.compare(userBall);

        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("BallStatus == NOTHING")
    void nothingTest() {
        Ball userBall = new Ball(2, 2);
        BallStatus ballStatus = comBall.compare(userBall);

        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    @DisplayName("IllegalArgumentException")
    void constructorExceptionTest() {
        assertThatThrownBy(() -> {
            new Ball(-1, 1);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            new Ball(3, 1);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            new Ball(0, 0);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            new Ball(0, 10);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
