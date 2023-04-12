package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    // 요구사항 1
    @Test
    void replace2() {
        String[] splited = "1,2".split(",");
        String[] one = splited[0].split(",");
        assertThat(splited).contains("1", "2");
        assertThat(one).containsExactly("1");
    }

    // 요구사항 2
    @Test
    void substring() {
        String subed = "(1,2)".substring(1,4);
        assertThat(subed).isEqualTo("1,2");
    }

    // 요구사항 3
    @Test
    @DisplayName("charAt method test")
    void chatAt() {
        char a = "abc".charAt(0);
        assertThat(a).isEqualTo('a');
        assertThatThrownBy(() -> {
            "abc".charAt(9);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
