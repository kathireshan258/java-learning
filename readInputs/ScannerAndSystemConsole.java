package readInputs;

import java.util.Scanner;

public class ScannerAndSystemConsole {
  static void main() {
    try {
      System.out.println(getAgeFromConsole(2026));
    } catch (NullPointerException e) {
      System.out.println(getAgeFromScanner(2026));
    }

  }

  static String getAgeFromConsole(int currentYear) {
    String name = System.console().readLine("Hi what is your name? ");
    System.out.println("Hello " + name + " welcome!");
    String birthYear = System.console().readLine("What is your Birth year? ");
    int parsedBirthAge = Integer.parseInt(birthYear);
    return "so you are " + (currentYear - parsedBirthAge);
  }

  static int checkYear(int currentYear, String birthYear) {
    int minimumYear = currentYear - 125;
    int parsedBirthYear = Integer.parseInt(birthYear);
    if ((parsedBirthYear < minimumYear) || (parsedBirthYear > currentYear)) {
      return -1;
    }
    return currentYear - parsedBirthYear;
  }

  static String getAgeFromScanner(int currentYear) {
    System.out.print("Hello, what is your name? ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    boolean isValidYear = false;
    int age = 0;
    do {
      System.out.print("Hi " + name + " what is your birth year? (Year should be >=" +
          (currentYear - 125) + " or <= " + currentYear + ") ");
      String birthYear = scanner.nextLine();
      try {
        age = checkYear(currentYear, birthYear);
        isValidYear = age > 0;
      } catch (NumberFormatException badUserData) {
        System.out.println("You have entered a character! Enter the year only in numbers!");
      }
    } while (!isValidYear);
    return "So " + name + " you are " + age + " years old";
  }
}
