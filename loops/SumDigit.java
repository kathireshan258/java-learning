package loops;

public class SumDigit {
  static void main() {
    System.out.println("sum of digit 10: " + sumDigit(10));
    System.out.println("sum of digit 11: " + sumDigit(11));
    System.out.println("sum of digit 123: " + sumDigit(123));
    System.out.println("sum of digit 547: " + sumDigit(547));
    System.out.println("sum of digit 0: " + sumDigit(0));
    System.out.println("sum of digit -1: " + sumDigit(-1));
    System.out.println("sum of digit 9: " + sumDigit(9));
  }

  static int sumDigit(int number) {
    if (number < 0) return -1;
    int sum = 0;
    while (number > 9) {
      sum += number % 10;
      number /= 10;
    }
    return sum + number;
  }
}
