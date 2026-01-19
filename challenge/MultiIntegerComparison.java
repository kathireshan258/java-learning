package challenge;

public class MultiIntegerComparison {
  static void main() {
    System.out.println("Number 41, 22, 71: " + hasSameLastDigit(41, 22, 71));
    System.out.println("Number 23, 32, 42: " + hasSameLastDigit(23, 32, 42));
    System.out.println("Number 9, 99, 999: " + hasSameLastDigit(9, 99, 999));
    System.out.println("Number 12, 23, 41: " + hasSameLastDigit(12, 23, 41));
  }

  static boolean hasSameLastDigit(int a, int b, int c) {
    if (!isValid(a) || !isValid(b) || !isValid(c)) return false;

    boolean hasMatchingRightDigit = false;
    int firstRightDigit = a % 10;
    int secondRightDigit = b % 10;
    int thirdRightDigit = c % 10;

    if ((firstRightDigit == secondRightDigit) || (firstRightDigit == thirdRightDigit)) {
      hasMatchingRightDigit = true;
    } else if ((secondRightDigit == thirdRightDigit)) {
      hasMatchingRightDigit = true;
    }
    return hasMatchingRightDigit;
  }

  static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }
}
