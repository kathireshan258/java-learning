package challenge;

public class IntegerFirstAndLastDigit {
  static void main() {
    System.out.println("Sum of first and last digit of 252: " + sumFirstAndLastDigit(252));
    System.out.println("Sum of first and last digit of 257: " + sumFirstAndLastDigit(257));
    System.out.println("Sum of first and last digit of 0: " + sumFirstAndLastDigit(0));
    System.out.println("Sum of first and last digit of -10: " + sumFirstAndLastDigit(-10));
    System.out.println("Sum of first and last digit of 5: " + sumFirstAndLastDigit(5));
    System.out.println("Sum of first and last digit of 101: " + sumFirstAndLastDigit(101));
  }

  static int sumFirstAndLastDigit(int number) {
    if(number < 0) return -1;
    if(number < 10) return number * 2;

    int lastNumber = number % 10;
    do {
      number /= 10;
    } while (number >= 10);
    return lastNumber + number;
  }
}
