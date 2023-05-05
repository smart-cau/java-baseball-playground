package baseball.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Integer> mapStringToIntList(String string) {
        List<Integer> numbers = new ArrayList<>();
        for (String numberStr : string.split("")) {
            numbers.add(Integer.parseInt(numberStr));
        }

        return numbers;
    }
}
