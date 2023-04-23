package numberBaseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RefereeTest {
    private Referee referee = new Referee("713");

    @Test
    @DisplayName("1볼 1스트라이크")
    void oneBalllAndOneStrike() {
        String judge = referee.judgement("123");

        assertThat(judge).isEqualTo("1볼 1스트라이크");
    }

    @Test
    @DisplayName("1볼 ")
    void oneBall() {
        String judge = referee.judgement("145");

        assertThat(judge).isEqualTo("1볼 ");
    }

    @Test
    @DisplayName("2볼 ")
    void twoBallsl() {
        String judge = referee.judgement("671");

        assertThat(judge).isEqualTo("2볼 ");
    }

    @Test
    @DisplayName("3스트라이크")
    void threeStrikes() {
        String judge = referee.judgement("713");

        assertThat(judge).isEqualTo("3스트라이크");
    }

    @Test
    @DisplayName("nothing")
    void nothing() {
        String judge = referee.judgement("444");

        assertThat(judge).isEqualTo("nothing");
    }

    @Test
    @DisplayName("IllegalArgementException Test")
    void throwsIllegalArgementException() {
        assertThatThrownBy(() -> {
            referee.judgement("12345");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
