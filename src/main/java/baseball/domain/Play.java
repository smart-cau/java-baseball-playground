package baseball.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import baseball.utils.Result;
import baseball.utils.Utils;

public class Play {

    public static void main(String[] args) throws IOException {
        String isNewGame = "1";
        boolean isGameContinue = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (isNewGame.equals("1")) {
            Pitcher pitcher = new Pitcher();
            Set<Integer> randomNumbers = pitcher.pitch();

            Balls balls = new Balls(new ArrayList<>(randomNumbers));
            
            while (isGameContinue) {
                System.out.print("숫자를 입력해 주세요 : ");

                String swing = br.readLine();

                List<Integer> userNumbers = Utils.mapStringToIntList(swing);

                Result result = balls.compare(userNumbers);

                if (result.getBallNo() > 0)
                    System.out.print(result.getBallNo() + "볼 ");

                if (result.getStrikeNo() > 0)
                    System.out.println(result.getBallNo() + "스트라이크");
                
                if (result.isNothing()) 
                    System.out.println("Nothing");

                if (result.isGameEnd()) {
                    System.out.println("숫자를 모두 맞히셨습니다. 게임 종료!");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    isNewGame = br.readLine();
                    isGameContinue = !result.isGameEnd();
                }
            }
        }

        System.out.println("게임이 종료되었습니다.");
    }
}
