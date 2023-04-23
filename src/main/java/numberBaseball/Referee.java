package numberBaseball;

public class Referee {
    private String numberString;
    private int balls = 0;
    private int strikes = 0;

    public Referee(String numberString) {
        this.numberString = numberString;
    }

    public String judgement(String swing) throws IllegalArgumentException {
        if (swing.length() != 3)
            throw new IllegalArgumentException("Length of swing must be 3");

        this.balls = 0;
        this.strikes = 0;

        StringBuilder strikesResult = new StringBuilder();
        StringBuilder ballsResult = new StringBuilder();

        for (int i = 0; i < 3; i++) {

            if (this.isBall(swing, i)) {
                this.balls++;
            }

            if (this.isStrike(swing, i)) {
                this.strikes++;
            }
        }

        if (this.balls == 0 && this.strikes == 0)
            return "nothing";

        if (this.balls > 0)
            strikesResult.append(Integer.toString(this.balls) + "볼 ");

        if (this.strikes > 0)
            strikesResult.append(Integer.toString(this.strikes) + "스트라이크");
        return ballsResult.toString() + strikesResult.toString();
    }

    private boolean isBall(String swing, int i) {
        String digitToString = Character.toString(swing.charAt(i));
        return numberString.charAt(i) != swing.charAt(i) && numberString.contains(digitToString);
    }

    private boolean isStrike(String swing, int i) {
        return this.numberString.charAt(i) == swing.charAt(i);
    }

    public boolean isGameEnd() {
        return this.strikes == 3;
    }
}
