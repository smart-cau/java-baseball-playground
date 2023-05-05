package baseball.utils;

public class Validations {
    public static boolean ball (int index, int number) {
        if (0 > index || index > 2) {
            return false;
        }

        if (0 >= number || number > 9) {
            return false;
        }

        return true;
    }
}
