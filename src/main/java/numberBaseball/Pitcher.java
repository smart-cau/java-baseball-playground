package numberBaseball;

import java.util.Random;

public class Pitcher {
    public String genRandomNumber() {
        StringBuilder stringNumber = new StringBuilder();

        Random rand = new Random();
        int max = 9;

        int first = rand.nextInt(max);
        int second = rand.nextInt(max);
        int third = rand.nextInt(max);

        stringNumber.append(first);
        stringNumber.append(second);
        stringNumber.append(third);

        return stringNumber.toString();
    }
}
