package numberBaseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hitter {
    public static boolean isKeepGoing(boolean isGameEnd) throws IOException {
        if (isGameEnd) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String isContinue = br.readLine();
            if (isContinue.equals("2")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Pitcher pitcher = new Pitcher();
        Referee referee = new Referee(pitcher.genRandomNumber());

        while (true) {
            System.out.print("숫자를 입력해 주세요 : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String swing = br.readLine();

            try {
                String result = referee.judgement(swing);
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println("3자리 수를 입력해야 합니다.");
            }

            if (!isKeepGoing(referee.isGameEnd()))
                break;
        }

        System.out.println("게임이 종료되었습니다.");
    }
}
