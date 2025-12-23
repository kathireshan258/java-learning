package challenge;

public class Challenge10 {
  static void main() {
    System.out.println(hasTeen(9,19,99));
    System.out.println(hasTeen(9,99,19));
    System.out.println(hasTeen(9,1,2));
    System.out.println(hasTeen(23,15,42));
    System.out.println(hasTeen(22,23, 34));

    System.out.println(isTeen(9));
    System.out.println(isTeen(99));
    System.out.println(isTeen(999));
    System.out.println(isTeen(19));
  }

  static boolean hasTeen(int first, int second, int third) {
    return ((first >= 13 && first <= 19)) ||
        (second >= 13 && second <= 19) ||
        (third >= 13 && third <= 19);
  }

  static boolean isTeen(int number) {
    return number >= 13 && number <= 19;
  }
}
