package challenge;

public class EvenIntegerDigitSum {
  static void main() {
    System.out.println("Sum of even digits in 123456789: " + getEvenDigitSum(123456789)); //20
    System.out.println("Sum of even digits in 252: " + getEvenDigitSum(252)); //4
    System.out.println("Sum of even digits in -22: " + getEvenDigitSum(-22)); //-1
    System.out.println("Sum of even digits in 101: " + getEvenDigitSum(101)); //0
    System.out.println("Sum of even digits in 22: " + getEvenDigitSum(22)); //4
    System.out.println("Sum of even digits in 202: " + getEvenDigitSum(202)); //4
  }

  static int getEvenDigitSum(int number) {
    if (number < 0) return -1;

    int sum = 0;
    while (number >= 10) {
      int lastNumber = number % 10;
      if (lastNumber % 2 == 0) sum += lastNumber;
      number /= 10;
    }
    if (number % 2 == 0) sum += number;
    return sum;
  }
}
