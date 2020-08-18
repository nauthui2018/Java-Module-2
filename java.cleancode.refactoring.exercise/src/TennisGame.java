public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            score = getTheSameScoring(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = getTieBreakScoring(player1Score, player2Score, score);
        } else {
            score = getCorrespondingCall(player1Score, player2Score, score);
        }
        return score;
    }

    public static String getCorrespondingCall(int player1Score, int player2Score, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    public static String getTheSameScoring(int player1Score) {
        String score;
        switch (player1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String getTieBreakScoring(int player1Score, int player2Score, String score) {
        int gapScore = player1Score - player2Score;
        switch (gapScore) {
            case 1:
                score = "Advantage player1";
                break;
            case -1:
                score = "Advantage player2";
                break;
            case 2:
                score = "Win for player1";
                break;
            case -2:
                score = "Win for player2";
                break;
        }
        return score;
    }
}
