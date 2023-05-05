package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import baseball.utils.BallStatus;
import baseball.utils.Result;
import baseball.utils.Utils;

public class BallsTest {

    Balls balls;

    @BeforeEach
    void setup() {
        balls = new Balls(new ArrayList<>(Arrays.asList(1, 2, 3)));
    }

    @Test
    void compareStrikeTest() {
        BallStatus ballStatus = balls.compare(new Ball(0, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void compareBallTest() {
        BallStatus ballStatus = balls.compare(new Ball(2, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void compareNothingTest() {
        BallStatus ballStatus = balls.compare(new Ball(2, 5));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @ParameterizedTest
    @CsvSource(value = { "123:0,3", "321:2,1", "456:0,0" }, delimiter = ':')
    void compareTest(String numbersStr, String ballAndStrikeNo) {
        List<Integer> numbers = Utils.mapStringToIntList(numbersStr);

        String[] splited = ballAndStrikeNo.split(",");

        Result result = balls.compare(numbers);

        assertThat(result.getBallNo()).isEqualTo(Integer.parseInt(splited[0]));
        assertThat(result.getStrikeNo()).isEqualTo(Integer.parseInt(splited[1]));
    }

    @Test
    void isGameEndTest() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        Result result = balls.compare(numbers);

        assertThat(result.isGameEnd()).isTrue();
    }

}
