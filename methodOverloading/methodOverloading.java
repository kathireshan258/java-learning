package methodOverloading;

public class methodOverloading {
  static void main() {
    System.out.println("Player scored " + calculateScore("Tim", 20));
    System.out.println("Player scored " + calculateScore(30));
    System.out.println("Player scored " + calculateScore());
  }

  static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points.");
    return score * 1000;
  }

  static int calculateScore(int score) {
    return calculateScore("Anonymous", score);
  }

  static int calculateScore() {
    System.out.println("No Player name, player score.");
    return 0;
  }
}
