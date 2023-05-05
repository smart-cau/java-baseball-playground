package baseball.domain;

import java.util.HashSet;
import java.util.Set;

public class Pitcher {

    private Set<Integer> numbers;

    Pitcher() {
        numbers = new HashSet<Integer>();
    }

    public Set<Integer> pitch() {
        while (0 <= numbers.size() && numbers.size() < 3) {
            int rand = (int)(Math.random() * 9) + 1;
            numbers.add(rand);
        }
        return numbers;
    }
    
}
