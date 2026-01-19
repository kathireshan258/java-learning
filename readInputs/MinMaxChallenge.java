package readInputs;

import java.util.Scanner;

public class MinMaxChallenge {
  static void main() {
    minMax();
  }

  static void minMax() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello get started, enter numeric value or character to quit!");
    boolean canContinue = true;
    double min = 0, max = 0;
    int i = 1;
    do {
      try {
        System.out.print("Enter value #" + i + ": ");
        double number = Double.parseDouble(scanner.nextLine());
        if (i == 1) {
          min = number;
          max = number;
        }
        if (min > number) min = number;
        if (max < number) max = number;
        i++;

      } catch (NumberFormatException userDataError) {
        System.out.println("Entered character, hence quitting the loop!");
        canContinue = false;
      }
    } while (canContinue);
    scanner.close();
    System.out.println("Min: " + min + " Max: " + max);
  }
}
