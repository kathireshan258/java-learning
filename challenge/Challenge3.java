package challenge;

public class Challenge3 {
  static void main() {
    checkNumber(200);
    checkNumber(10);
    checkNumber(1);
    checkNumber(-1);
    checkNumber(0);

  }

  static void checkNumber(int number) {
    String result = number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero";
    System.out.println(result);
  }
}
