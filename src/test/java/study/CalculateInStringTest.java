package study;
import org.junit.jupiter.api.Test;

import calculateInString.CalculateInString;

import static org.assertj.core.api.Assertions.*;

public class CalculateInStringTest {
    private CalculateInString sut = new CalculateInString();

    @Test
    void calcuate_success() {
        String input1 = "1 + 2 + 3";
        double result1 = sut.calcuate(input1);

        String input2 = "2 + 3 * 4 / 2"; // -> 2342+*/
        double result2 = sut.calcuate(input2);

        assertThat(result1).isEqualTo(6.0);
        assertThat(result2).isEqualTo(10.0);
    }
}
