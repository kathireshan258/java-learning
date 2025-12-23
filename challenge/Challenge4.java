package challenge;

// Speed converter
public class Challenge4 {
  static void main() {
    printConversion(-1);
    printConversion(0);
    printConversion(1);
    printConversion(10);
    printConversion(25.42);
    printConversion(75.114);
  }
  static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) return -1;
    return Math.round(kilometersPerHour / 1.609);

  }

  static void printConversion(double kilometersPerHour) {
    long milesPerHour = toMilesPerHour(kilometersPerHour);
    System.out.println(
    kilometersPerHour < 0 ? "Invalid Value" :
    kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
  }
}
