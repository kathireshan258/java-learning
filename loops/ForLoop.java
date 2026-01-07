package loops;

public class ForLoop {
  static void main() {
    double amount = 1000;
    for(double rate = 7.5; rate < 10; rate+= 0.25) {
      double interestAmount = calculateInterest(rate, amount);
      if(rate >= 8.5) {
        break;
      }
      System.out.println("INR RS." + amount + " with interest rate " + rate + " is " + interestAmount);
    }
  }

  static double calculateInterest(double rate, double amount) {
    return amount * (rate / 100);
  }
}
