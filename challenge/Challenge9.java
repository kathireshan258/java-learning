package challenge;

public class Challenge9 {
  static void main() {
    System.out.println(hasEqualSum(1,1, 2));
    System.out.println(hasEqualSum(1,2, 3));
    System.out.println(hasEqualSum(1, 0, 1));
    System.out.println(hasEqualSum(1, -1, 0));
    System.out.println(hasEqualSum(-1, 0, 1));
  }

  static boolean hasEqualSum(int a, int b, int c) {
    return a + b == c;
  }
}
