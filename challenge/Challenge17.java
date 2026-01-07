package challenge;

public class Challenge17 {
  static void main() {
    System.out.println("Sum of add numbers between " + 1 + " and " + 100 + ": " + sumOdd(1, 100));
    System.out.println("Sum of add numbers between " + -1 + " and " + 100 + ": " + sumOdd(-1, 100));
    System.out.println("Sum of add numbers between " + 100 + " and " + 100 + ": " + sumOdd(100,100));
    System.out.println("Sum of add numbers between " + 13 + " and " + 13 + ": " + sumOdd(13,13));
    System.out.println("Sum of add numbers between " + 100 + " and " + -100 + ": " + sumOdd(100, -100));
    System.out.println("Sum of add numbers between " + 100 + " and " + 1000 + ": " + sumOdd(100,1000));
  }

  static boolean isOdd(int number) {
    if(number < 0) return false;
    return number % 2 != 0;
  }

  static int sumOdd(int start, int end) {
    if (start <= 0 || end < start) return -1;
    int sum = 0;
    for(; start <= end; start++) {
      if(isOdd(start)) sum += start;
    }
    return sum;
  }
}
