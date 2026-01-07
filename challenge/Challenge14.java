package challenge;

public class Challenge14 {
  static void main() {
    System.out.println(isCatPlaying(true, 25));
    System.out.println(isCatPlaying(false, 25));
    System.out.println(isCatPlaying(true, 35));
    System.out.println(isCatPlaying(true, 45));
    System.out.println(isCatPlaying(false, 35));
    System.out.println(isCatPlaying(false, 45));
    System.out.println(isCatPlaying(false, 0));
    System.out.println(isCatPlaying(true, 0));
  }

  static boolean isCatPlaying(boolean summer, int temperature) {
    int MIN_TEMPERATURE = 25;
    int MAX_TEMPERATURE = summer ? 45 : 35;

    return temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE;
  }
}
