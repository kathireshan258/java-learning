package loops;

public class EvenNumbers {
  static void main() {
    int num = 5;
    int totalEven = 0;
    while(num<=20) {
      if (isEven(num)) {
        System.out.println(num + " is a even number");
        totalEven++;
      }
      if(totalEven == 5) break;
      num++;
    }
    System.out.println("Total Even number between 5 and 20: " + totalEven);
  }

  static boolean isEven(int number) {
    return number % 2 == 0;
  }
}
