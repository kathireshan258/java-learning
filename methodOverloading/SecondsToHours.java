package methodOverloading;

public class SecondsToHours {
  static void main() {
    System.out.println("3600 seconds = " + getDurationString(3600));
    System.out.println("4000 seconds = " + getDurationString(66, 6));
    System.out.println("600 seconds = " + getDurationString(10 , 0));
  }

  static String getDurationString(int seconds) {

    if  (seconds < 0) {
      System.out.println("Invalid duration: " + seconds);
      return "";
    }

    int hour = seconds / 3600;
    int minute = seconds % 3600 / 60;
    int second = seconds % 60;

    return hour + "h " + minute + "m " + second + "s.";
  }

  static String getDurationString(int minutes, int seconds) {
    if  (minutes < 0 || seconds > 60) {
      System.out.println("Invalid duration: " + minutes + " " + seconds);
      return "";
    }

    int totalMinutes = (minutes * 60) + seconds;
    return getDurationString(totalMinutes);
  }
}
