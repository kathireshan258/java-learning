package challenge;

// method challenge
public class Challenge2 {
  static void main() {
    displayHighScorePosition("Tim", calculateHighScorePosition(80));
    displayHighScorePosition("Tim", calculateHighScorePosition(100));
    displayHighScorePosition("Tim", calculateHighScorePosition(120));
    displayHighScorePosition("Tim",  calculateHighScorePosition(500));
    displayHighScorePosition("Tim",  calculateHighScorePosition(800));
    displayHighScorePosition("Tim",  calculateHighScorePosition(1000));
    displayHighScorePosition("Tim",  calculateHighScorePosition(1200));
  }

  static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the high score list");
  }

  static int calculateHighScorePosition(int score) {
    int result;
    if (score >= 1000) {
      result = 1;
    } else if (score >= 500) {
      result = 2;
    } else if (score >= 100) {
      result = 3;
    } else {
      result = 4;
    }
    return result;
  }
}
