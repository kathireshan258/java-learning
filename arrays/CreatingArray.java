package arrays;

import java.util.Scanner;

public class CreatingArray {
  static void main() {
    System.out.print("Hello, enter the count of values to be input: ");
    int count = 0;
    boolean canIterate = true;
    do {
      try {
        count = Integer.parseInt(readDataFromScanner());
        canIterate = false;
      } catch (NumberFormatException userDataError) {
        System.out.println("Enter only integers, characters are not allowed!");
      }
    } while (canIterate);

    int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      canIterate = true;
      do {
        try {
          System.out.print("Enter values for #" + (i + 1) + ": ");
          arr[i] = Integer.parseInt(readDataFromScanner());
          canIterate = false;
        } catch (NumberFormatException userDataError) {
          System.out.println("Enter only integers, characters are not allowed!");
        }
      } while(canIterate);
    }

    System.out.println("------------------------");
    System.out.println("Entered values are: ");
    for (int j : arr) {
      System.out.print(j + ", ");
    }

  }

  static String readDataFromScanner() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}
