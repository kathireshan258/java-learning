package challenge;

public class Challenge12 {
  static void main() {
    printYearsAndDays(525600);
    printYearsAndDays(527040);
  }

  static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
      return;
    }
    // 1 hour = 60 minutes
    // 1 day = 24 hours
    // 1 year = 365 days

    int totalMinutesInYear = (24 * 60) * 365;
    long totalYear = minutes / totalMinutesInYear;
    long remainingDays = (minutes % totalMinutesInYear) / (24 * 60);

    System.out.println(minutes + " min = " + totalYear + " y and " + remainingDays + " d");
  }
}
