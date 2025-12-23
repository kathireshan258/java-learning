package challenge;

public class Challenge8 {
  static void main() {
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    System.out.println(areEqualByThreeDecimalPlaces(3.1, 3.123));
  }

  static boolean areEqualByThreeDecimalPlaces(double a, double b) {
    a = (int) (a * 1000);
    a =  a / 1000;
    b =  (int) (b * 1000);
    b =  b / 1000;
//    System.out.println("value of a: " + a);
//    System.out.println("value of b: " + b);
    return a == b;
  }
}
