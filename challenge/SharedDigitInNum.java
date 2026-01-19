package challenge;

public class SharedDigitInNum {
  static void main() {
    System.out.println("Number 12, 23 has shared Number?: " + hasSharedDigit(12,23));
    System.out.println("Number 9, 99 has shared Number?: " + hasSharedDigit(9,99));
    System.out.println("Number 15, 55 has shared Number?: " + hasSharedDigit(15,55));
    System.out.println("Number 12, 34 has shared Number?: " + hasSharedDigit(12,34));
    System.out.println("Number 0, 0 has shared Number?: " + hasSharedDigit(0,0));
    System.out.println("Number 100, 23 has shared Number?: " + hasSharedDigit(100,23));
  }

  static boolean hasSharedDigit(int a, int b) {
    if ((a <10 || a > 99) || (b < 10 || b > 99)) return false;

    boolean hasSharedNum = false;
    for (int i = a; i > 0; i /= 10) {
      int firstNumLastDigit = i % 10;
      for (int j = b; j > 0; j /= 10) {
        int secondNumLastDigit = j % 10;
        if (secondNumLastDigit == firstNumLastDigit) {
          hasSharedNum = true;
          break;
        }
      }
      if (hasSharedNum) break;
    }
    return hasSharedNum;
  }
}
