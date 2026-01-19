package challenge;

public class NumberToWords {
  static void main() {
    numberToWords(123);
    numberToWords(41);
    numberToWords(100);
    numberToWords(001);
    numberToWords(-1);
  }

  static void numberToWords(int number) {
    if (number < 0) System.out.println("Invalid Value");

    if (number == 0) {
      System.out.println("Zero");
    }

    int reversedNum = reverse(number);
    int leadingZero = getDigitCount(number) - getDigitCount(reversedNum);
    while (reversedNum > 0) {
      switch (reversedNum % 10) {
        case 0 -> System.out.println("Zero");
        case 1 -> System.out.println("One");
        case 2 -> System.out.println("Two");
        case 3 -> System.out.println("Three");
        case 4 -> System.out.println("Four");
        case 5 -> System.out.println("Five");
        case 6 -> System.out.println("Six");
        case 7 -> System.out.println("Seven");
        case 8 -> System.out.println("Eight");
        case 9 -> System.out.println("Nine");
      }
      reversedNum /= 10;
    }

    for(int i = 0; i < leadingZero; i++) {
      System.out.println("Zero");
    }
//    System.out.println("=================");
  }

  static int reverse(int number) {
    int reversedNumber = 0;
    while (number != 0) {
      reversedNumber += number % 10;
      reversedNumber *= 10;
      number /= 10;
    }
    reversedNumber /= 10;
    return reversedNumber;
  }

  static int getDigitCount(int number) {
    if (number < 0) return -1;
    if(number == 0) return 1;
    int count = 0;
    for (int i = 1; i<= number; i*=10) {
      count++;
    }
    return count;
  }
}
