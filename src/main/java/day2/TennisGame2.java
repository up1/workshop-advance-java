package day2;

public class TennisGame2 implements TennisGame {
    public int p1Point;
    public int p2Point;
    public String p1Result;
    public String p2Result;
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] results = { "Love", "Fifteen", "Thirty", "Forty" };

        // Win
        if (Math.abs(p1Point - p2Point) >= 2 && Math.max(p1Point, p2Point) >= 4) {
            if (p1Point > p2Point) {
                return "Win for " + player1Name;
            }
            return "Win for " + player2Name;
        }

        // Advantage
        if (หลังจากทำการdueueครั้งแรก() && คะแนะของทั้งคู่ต้องห่างหนึ่งคะแนน()) {
            if (p1Point > p2Point) {
                return "Advantage " + player1Name;
            }
            return "Advantage " + player2Name;
        }

        // Deuce
        if (p1Point == p2Point && p1Point >= 3) {
            return "Deuce";
        }

        // For All
        if (p1Point == p2Point && p1Point < 3) {
            return results[p1Point] + "-All";
        }

        return results[p1Point] + "-" + results[p2Point];    
    }

    private boolean คะแนะของทั้งคู่ต้องห่างหนึ่งคะแนน() {
        return Math.abs(p1Point - p2Point) == 1;
    }

    private boolean หลังจากทำการdueueครั้งแรก() {
        return p1Point + p2Point > 6;
    }

    public void P1Score() {
        p1Point++;
    }

    public void P2Score() {
        p2Point++;
    }

    public void wonPoint(String player) {
        if ((player.equals(player1Name)))
            P1Score();
        else
            P2Score();
    }
}
