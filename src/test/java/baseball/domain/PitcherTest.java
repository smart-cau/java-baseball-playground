package baseball.domain;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PitcherTest {
    Pitcher pitcher;

    @BeforeEach
    void setup () {
        pitcher = new Pitcher();
    }

    @Test
    void pitchSuccess() {
        Set<Integer> pitch = pitcher.pitch();

        assertThat(pitch.size()).isEqualTo(3);

        pitch.forEach((num) -> {
            assertThat(num).isBetween(1, 9);
        });
    }
}
