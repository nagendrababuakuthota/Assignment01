import java.util.ArrayList;
import java.util.List;
public class _09CricketScores {
    public static void main(String[] args) {
        List<Integer> ballByBallScores = new ArrayList<>();
        ballByBallScores.add(1);
        ballByBallScores.add(0);
        ballByBallScores.add(4);
        ballByBallScores.add(1);
        ballByBallScores.add(6);
        ballByBallScores.add(0);
        System.out.println("Ball-by-ball scores:");
        for (int score : ballByBallScores) {
            System.out.print(score + " ");
        }
    }
}
