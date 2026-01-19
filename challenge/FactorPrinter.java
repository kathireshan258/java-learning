package challenge;

public class FactorPrinter {
  static void main() {
    printFactors(6);
    printFactors(32);
    printFactors(10);
    printFactors(-1);
  }

  static void printFactors(int number) {
    if (number < 1) {
      System.out.println("Invalid Value");
      return;
    }

    if (number == 1) {
      System.out.println(number);
      return;
    }

    for (int i = 1; i <= number / 2 ; i++) {
      if (number % i == 0) System.out.println(i);
    }
    System.out.println(number);
  }
}
