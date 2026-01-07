package loops;

public class PrimeNumbers {

  static void main() {
    System.out.println("is 100 a prime number: " + isPrime(100));
    System.out.println("is 20 a prime number: " +  isPrime(20));
    System.out.println("is 3 a prime number: " +  isPrime(3));
    printFirstThreePrimeNumber(2, 20);
    newTry(2, 20);
  }

  static boolean isPrime(int wholeNumber) {
    if (wholeNumber < 2) return wholeNumber == 1;

    boolean isPrime = true;
//    System.out.println("wholenumber/2: " + wholeNumber/2);

    for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
      if (wholeNumber % divisor == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }

  static void printFirstThreePrimeNumber(int start, int end) {
    int count = 0;
    for(int i = start; i <= end; i++) {
      boolean isPrime = true;
      if(i< 2) {
        isPrime = false;
      }
      for(int j = 2; j <= i/2; j++) { // 8/ 2 = 4
        if(i%j == 0) {  // j = 2
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        count++;
        System.out.println("Prime number: " + i);
      }
      if(count == 3) break;
    }
    System.out.println("Count: " + count);
    }

    static void newTry(int a, int b) {
    int count = 0;
     for (int i = a; i <= b; i++) {
       boolean isPrime = true;
      for(int j = 2; j <= i/2; j++) {
        if (i%j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        count++;
        System.out.println("Prime number " + i);
      }

      if (count == 3) break;
     }
      System.out.println("count: " + count);
    }
}
