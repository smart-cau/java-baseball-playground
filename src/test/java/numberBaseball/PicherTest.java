package numberBaseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PicherTest {

    Pitcher pitcher = new Pitcher();

    @Test
    @DisplayName("랜덤 숫자 테스트")
    void randomNumberGenTest() {
        String randomNumber = pitcher.genRandomNumber();

        int first = Character.getNumericValue(randomNumber.charAt(0));
        int second = Character.getNumericValue(randomNumber.charAt(1));
        int third = Character.getNumericValue(randomNumber.charAt(2));

        assertThat(0 <= first && first <= 9).isEqualTo(true);
        assertThat(0 <= second && second <= 9).isEqualTo(true);
        assertThat(0 <= third && third <= 9).isEqualTo(true);
    }
}
