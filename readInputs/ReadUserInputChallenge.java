package readInputs;

import java.util.Scanner;


public class ReadUserInputChallenge {
  static void main() {
    readAndCalculateUsingScanner();
    readAndCalculateUsingConsole();
  }

  static void readAndCalculateUsingScanner() {
    boolean isReceived = false;
    int limit = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      try {
        System.out.print("Enter the count of numbers to be received: ");
        limit = Integer.parseInt(scanner.nextLine());
        isReceived = true;
      } catch (NumberFormatException userDataError) {
        System.out.println("Only number is allowed, characters are not accepted!");
      }
    } while (!isReceived);
    int i = 0;
    int total = 0;
    while (i < limit) {
      System.out.print("Enter number #" + (i + 1) + ": ");
      try {
        total += Integer.parseInt(scanner.nextLine());
        i++;
      } catch (NumberFormatException userDataError) {
        System.out.println("Enter only numbers, characters are not allowed!");
      }
    }
    System.out.println("The addition of all the values is: " + total);
  }

  static void readAndCalculateUsingConsole() {
    boolean isReceived = false;
    int limit = 0;
    do {
      try {
        limit = Integer.parseInt(System.console().readLine("Enter the count of numbers to be received: "));
        isReceived = true;
      } catch (NumberFormatException userDataError) {
        System.out.println("Characters are not allowed, only numbers to be inputted!");
      }
    } while (!isReceived);

    int i = 0;
    int total = 0;
    while (i < limit) {
      try {
        total += Integer.parseInt(System.console().readLine("Enter number #" + (i + 1) + ": "));
        i++;
      } catch (NumberFormatException userDataError) {
        System.out.println("Characters are not allowed, enter only numbers!");
      }
    }
    System.out.println("Sum of all the values: " + total);
  }
}
